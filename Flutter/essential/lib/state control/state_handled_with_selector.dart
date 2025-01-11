import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

class DataModel with ChangeNotifier {
  int data1 = 0;
  int data2 = 10;

  void changeData1() {
    data1++;
    notifyListeners();
  }

  void changeData2() {
    data2++;
    notifyListeners();
  }
}

void main() => runApp(StateHandledWithSelectorApp());

class StateHandledWithSelectorApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('Selector Text'),
        ),
        body: MultiProvider(
          providers: [
            ChangeNotifierProvider<DataModel>.value(value: DataModel())
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
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Consumer<DataModel>(
            builder: (context, model, child) {
              return Container(
                color: Colors.green,
                padding: EdgeInsets.all(20),
                child: Center(
                  child: Text(
                    'consumer, data1 : ${model.data1}, data2 : ${model.data2}',
                    style: TextStyle(
                      fontSize: 20,
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                ),
              );
            },
          ),
          Selector<DataModel, int>(
            builder: (context, data, child) {
              return Container(
                color: Colors.cyan,
                padding: EdgeInsets.all(20),
                child: Center(
                  child: Text(
                    'selector, data : ${data}',
                    style: TextStyle(
                      fontSize: 20,
                      fontWeight: FontWeight.bold,
                      color: Colors.white,
                    ),
                  ),
                ),
              );
            },
            selector: (context, model) => model.data2,
          ),
          Column(
            children: [
              ElevatedButton(
                child: Text('model data1 change'),
                onPressed: () {
                  var model1 = Provider.of<DataModel>(context, listen: false);
                  model1.changeData1();
                },
              ),
              ElevatedButton(
                child: Text('model data2 change'),
                onPressed: () {
                  var model2 = Provider.of<DataModel>(context, listen: false);
                  model2.changeData2();
                },
              )
            ],
          )
        ],
      ),
    );
  }
}
