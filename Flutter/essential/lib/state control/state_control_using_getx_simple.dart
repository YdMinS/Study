import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:get/get_state_manager/get_state_manager.dart';

class CounterController extends GetxController {
  int count = 0;

  @override
  void onInit() {
    super.onInit();
  }

  @override
  void onClose() {
    super.onClose();
  }

  void increment() {
    count++;
    update();
  }

  void decrement() {
    count--;
    update();
  }
}

void main() {
  runApp(StateControlUsingGetxSimpleApp());
}

class StateControlUsingGetxSimpleApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'State Control Using Getx Simple App',
          ),
        ),
        body: GetBuilder(
          init: CounterController(),
          builder: (_) {
            return WidgetA();
          },
        ),
      ),
    );
  }
}

class WidgetA extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return GetBuilder<CounterController>(
      builder: (controller) {
        return Container(
          color: Colors.teal,
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  'GetX : ${controller.count}',
                  style: TextStyle(
                    color: Colors.white,
                    fontWeight: FontWeight.bold,
                    fontSize: 20,
                  ),
                ),
                ElevatedButton(
                  child: Text('increment'),
                  onPressed: controller.increment,
                ),
                ElevatedButton(
                  child: Text('decrement'),
                  onPressed: controller.decrement,
                )
              ],
            ),
          ),
        );
      },
    );
  }
}
