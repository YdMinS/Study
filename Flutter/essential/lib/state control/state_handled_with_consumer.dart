import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

class DataModelA with ChangeNotifier {
  int data = 0;

  void changeData() {
    data++;
    notifyListeners();
  }
}

class DataModelB with ChangeNotifier {
  String data = "hello";

  void changeData() {
    if (data == "hello") {
      data = "world";
    } else {
      data = "hello";
    }
    notifyListeners();
  }
}

void main() => runApp(StateHandledWithConsumerApp());

class StateHandledWithConsumerApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('State Handled With Consumer App'),
        ),
        body: MultiProvider(
          providers: [
            ChangeNotifierProvider<DataModelA>.value(value: DataModelA()),
            ChangeNotifierProvider<DataModelB>.value(value: DataModelB())
          ],
          child: HomeWidget(),
        ),
      ),
    );
  }
}

class HomeWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.red,
      child: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Consumer2<DataModelA, DataModelB>(
              builder: (context, model1, model2, child) {
                return SubWidget1(model1, model2, child);
              },
              child: SubWidget2(),
            ),
            Column(
              children: [
                ElevatedButton(
                  child: Text(
                    'model1 change',
                  ),
                  onPressed: () {
                    var model1 =
                        Provider.of<DataModelA>(context, listen: false);
                    model1.changeData();
                  },
                ),
                ElevatedButton(
                  child: Text('model2 change'),
                  onPressed: () {
                    var model2 =
                        Provider.of<DataModelB>(context, listen: false);
                    model2.changeData();
                  },
                )
              ],
            )
          ],
        ),
      ),
    );
  }
}

class SubWidget1 extends StatelessWidget {
  DataModelA modelA;
  DataModelB modelB;
  Widget? child;

  SubWidget1(this.modelA, this.modelB, this.child);

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.green,
      padding: EdgeInsets.all(20),
      child: Column(
        children: [
          Text(
            'SubWidget 1, ${modelA.data}, ${modelB.data}',
            style: TextStyle(
              fontSize: 20,
              fontWeight: FontWeight.bold,
              color: Colors.white,
            ),
          ),
          child!
        ],
      ),
    );
  }
}

class SubWidget2 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.deepOrange,
      padding: EdgeInsets.all(20),
      child: Text(
        'SubWidget2',
        style: TextStyle(
          fontSize: 20,
          fontWeight: FontWeight.bold,
          color: Colors.white,
        ),
      ),
    );
  }
}
