import 'package:flutter/material.dart';
import 'package:get/get.dart';

class User {
  String name = '';
  int age = 0;
}

class CounterController extends GetxController {
  var count = 0.obs;
  var isChecked = false.obs;
  var title = ''.obs;
  var user = User().obs;

  @override
  void onInit() {
    super.onInit();
    ever(count, (value) => print('ever : $value'));
    once(count, (value) => print('once : $value'));
    debounce(count, (value) => print('debounce : $value'),
        time: Duration(seconds: 1));
    interval(count, (value) => print('interval : $value'),
        time: Duration(seconds: 1));
  }

  @override
  void onClose() {
    super.onClose();
  }
}

void main() {
  runApp(StateControlUsingGetxReactiveApp());
}

class StateControlUsingGetxReactiveApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Get.put(CounterController());
    return GetMaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'State Control Using GetX Reactive App',
          ),
        ),
        body: WidgetA(),
      ),
    );
  }
}

class WidgetA extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return GetX<CounterController>(
      builder: (controller) {
        return Container(
          color: Colors.brown,
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  'GetX : ${controller.count}, ${controller.isChecked.value}, ${controller.title.value}',
                  style: TextStyle(
                    color: Colors.white,
                    fontWeight: FontWeight.bold,
                    fontSize: 20,
                  ),
                ),
                Text(
                  'GetX : ${controller.user.value.name}, ${controller.user.value.age}',
                  style: TextStyle(
                    fontSize: 20,
                    color: Colors.white,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                ElevatedButton(
                  child: Text('change'),
                  onPressed: () {
                    controller.count.value++;
                    if (controller.title.value == 'hello') {
                      controller.title.value = 'world';
                    } else {
                      controller.title.value = 'hello';
                    }
                    controller.isChecked.value = !controller.isChecked.value;
                    if (controller.user.value.name == 'ydmins') {
                      controller.user.value.name = 'YdMinS';
                    } else {
                      controller.user.value.name = 'ydmins';
                    }
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
