import 'package:flutter/material.dart';

void main() {
  runApp(StateControlledByInheritedWidgetApp());
}

class StateControlledByInheritedWidgetApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('State Controlled by Inherited Widget App'),
        ),
        body: InheritedWidgetA(TestWidget()),
      ),
    );
  }
}

class InheritedWidgetA extends InheritedWidget {
  int count = 0;

  InheritedWidgetA(child) : super(child: child);

  increment() {
    count++;
  }

  @override
  bool updateShouldNotify(covariant InheritedWidget oldWidget) => true;

  static InheritedWidgetA? of(BuildContext context) =>
      context.dependOnInheritedWidgetOfExactType<InheritedWidgetA>();
}

class TestSubWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    int count = InheritedWidgetA.of(context)!.count;
    return Container(
      width: 200,
      height: 200,
      color: Colors.yellow,
      child: Center(
        child: Text(
          'SubWidget : $count',
          style: TextStyle(
            color: Colors.white,
            fontWeight: FontWeight.bold,
            fontSize: 20,
          ),
        ),
      ),
    );
  }
}

class TestWidget extends StatelessWidget {
  TestWidget() {
    print('TestWidget constructor');
  }

  @override
  Widget build(BuildContext context) {
    return StatefulBuilder(
      builder: (BuildContext context, StateSetter setState) {
        InheritedWidgetA? widget = InheritedWidgetA.of(context);
        int counter = InheritedWidgetA.of(context)!.count;
        Function increment = InheritedWidgetA.of(context)!.increment;
        return Center(
          child: Container(
            color: Colors.red,
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Text(
                  'TestWidget : $counter',
                  style: TextStyle(
                    color: Colors.white,
                    fontSize: 20,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                ElevatedButton(
                  child: Text(
                    'increment()',
                  ),
                  onPressed: () => setState(() => increment()),
                ),
                ElevatedButton(
                  child: Text('count++'),
                  onPressed: () {
                    setState(() => widget!.count++);
                  },
                ),
                TestSubWidget()
              ],
            ),
          ),
        );
      },
    );
  }
}
