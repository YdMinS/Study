import 'dart:async';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

void main() => runApp(PlatformInterconnectionThroughMethodChannelApp());

class PlatformInterconnectionThroughMethodChannelApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: WidgetA(),
    );
  }
}

class WidgetA extends StatefulWidget {
  @override
  State<WidgetA> createState() => _WidgetAState();
}

class _WidgetAState extends State<WidgetA> {
  String? resultMessage;
  String? receiveMessage;

  Future<void> nativeCall() async {
    const channel = MethodChannel("methodChannelA");

    try {
      var details = {'Username': 'ydmins', 'Password': '1234'};
      final Map result = await channel.invokeMethod("methodA", details);
      setState(() {
        resultMessage = '${result["one"]}, ${result["two"]}';
      });
      channel.setMethodCallHandler((call) async {
        switch (call.method) {
          case 'methodB':
            setState(() {
              receiveMessage = "receive : ${call.arguments}";
            });
            return 'Reply from Dart';
        }
      });
    } on PlatformException catch (e) {
      print('Failed : ${e.message}.');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Method Channel App'),
      ),
      body: Container(
          color: Colors.deepOrangeAccent,
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  'resultMessage : ${resultMessage}',
                  style: TextStyle(
                    fontSize: 20,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                Text(
                  'receiveMessage : ${receiveMessage}',
                  style: TextStyle(
                    fontSize: 20,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                ElevatedButton(
                  child: Text('native call'),
                  onPressed: () {
                    nativeCall();
                  },
                ),
              ],
            ),
          )),
    );
  }
}
