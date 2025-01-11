import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';

class ARepository {
  anyFun() {
    print('repository is called');
  }
}

abstract class CounterEvent {
  int no;

  CounterEvent(this.no);
}

class IncrementEvent extends CounterEvent {
  IncrementEvent(no) : super(no);
}

class DecrementEvent extends CounterEvent {
  DecrementEvent(no) : super(no);
}

class BlocCounter extends Bloc<CounterEvent, int> {
  BlocCounter() : super(0) {
    on<IncrementEvent>((event, emit) {
      emit(state + 1);
    });
    on<DecrementEvent>((event, emit) {
      emit(state - 1);
    });
  }
}

void main() {
  runApp(StateControlUsingRepositoryApp());
}

class StateControlUsingRepositoryApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('State Control Using Repository App'),
        ),
        body: RepositoryProvider(
          create: (context) => ARepository(),
          child: BlocProvider(
            create: (context) => BlocCounter(),
            child: WidgetA(),
          ),
        ),
      ),
    );
  }
}

class WidgetA extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final BlocCounter blocCounter = BlocProvider.of<BlocCounter>(context);
    final ARepository repository = RepositoryProvider.of<ARepository>(context);
    return BlocConsumer<BlocCounter, int>(
      listenWhen: (previous, current) {
        return true;
      },
      listener: (context, state) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text('$state'),
            backgroundColor: Colors.blueGrey,
          ),
        );
      },
      buildWhen: (previous, current) {
        print('previous : $previous, current : ${current}');
        return true;
      },
      builder: (context, count) {
        return Container(
          color: Colors.deepOrange,
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  'Bloc : $count',
                  style: TextStyle(
                    color: Colors.white,
                    fontSize: 20,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                ElevatedButton(
                  child: Text(
                    'increment',
                  ),
                  onPressed: () {
                    blocCounter.add(IncrementEvent(1));
                    repository.anyFun();
                  },
                ),
                ElevatedButton(
                  child: Text('decrement'),
                  onPressed: () {
                    blocCounter.add(DecrementEvent(1));
                    repository.anyFun();
                  },
                )
              ],
            ),
          ),
        );
      },
    );
  }
}
