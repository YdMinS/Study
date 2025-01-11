import 'dart:async';
import 'dart:isolate';
import 'package:flutter/material.dart';

void main() {
  runApp(AsyncIsolateApp());
}

class AsyncIsolateApp extends StatefulWidget {
  @override
  State<AsyncIsolateApp> createState() => _AsyncIsolateAppState();
}

myIsolate(SendPort mainPort) {
  ReceivePort isoReceivePort = ReceivePort();
  mainPort.send({'port': isoReceivePort.sendPort});
  isoReceivePort.listen((message) {
    if (message['msg'] != 'bye') {
      int count = message['msg'];
      mainPort.send({'msg': count * count});
    } else {
      isoReceivePort.close();
    }
  });
}

class _AsyncIsolateAppState extends State<AsyncIsolateApp> {
  String result = '';

  void onPress() async {
    ReceivePort mainReceivePort = ReceivePort();
    await Isolate.spawn(myIsolate, mainReceivePort.sendPort);

    SendPort? isoSendPort;
    mainReceivePort.listen((message) {
      if (message['port'] != null) {
        isoSendPort = message['port'];
      } else {
        setState(() {
          result = 'msg : ${message['msg']}';
        });
      }
    });

    int count = 0;
    Timer.periodic(Duration(seconds: 1), (time) {
      count++;
      if (count < 6) {
        isoSendPort?.send({'msg': count});
      } else {
        isoSendPort?.send({'msg': 'bye'});
        mainReceivePort.close();
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Async Isolate App',
          ),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text(
                result,
                style: TextStyle(fontSize: 30),
              ),
              ElevatedButton(
                child: Text('TEST'),
                onPressed: onPress,
              )
            ],
          ),
        ),
      ),
    );
  }
}
