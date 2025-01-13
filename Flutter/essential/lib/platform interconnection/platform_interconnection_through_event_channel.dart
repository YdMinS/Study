import 'dart:async';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

void main() {
  runApp(PlatformInterconnectionThroughEventChannelApp());
}

class PlatformInterconnectionThroughEventChannelApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: WidgetA(),
    );
  }
}

class WidgetA extends StatefulWidget {
  @override
  State<WidgetA> createState() => _WidgetAState();
}

class _WidgetAState extends State<WidgetA> {
  String? receiveMessage;

  Future<Null> nativeCall() async {
    const channel = EventChannel('eventChannel');
    channel.receiveBroadcastStream().listen((dynamic event) {
      setState(() {
        receiveMessage = 'Received event : $event';
      });
    }, onError: (dynamic error) {
      print('Received error : ${error.message}');
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Event Channel'),
      ),
      body: Container(
        color: Colors.green,
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text(
                'receiveMessage : $receiveMessage',
                style: TextStyle(
                    color: Colors.white,
                    fontSize: 20,
                    fontWeight: FontWeight.bold),
              ),
              ElevatedButton(
                child: Text('native call'),
                onPressed: () {
                  nativeCall();
                },
              )
            ],
          ),
        ),
      ),
    );
  }
}
