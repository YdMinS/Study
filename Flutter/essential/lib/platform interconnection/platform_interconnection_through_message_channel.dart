import 'dart:async';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

void main() => runApp(PlatformInterconnectionThroughMessageChannelApp());

class PlatformInterconnectionThroughMessageChannelApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: NativeCallWidget(),
    );
  }
}

class NativeCallWidget extends StatefulWidget {
  @override
  State<NativeCallWidget> createState() => _NativeCallWidgetState();
}

class _NativeCallWidgetState extends State<NativeCallWidget> {
  String? resultMessage;
  String? receiveMessage;

  Future<Null> nativeCall() async {
    const channel = BasicMessageChannel('messageChannelA', StringCodec());
    String? result = await channel.send('Hello from Dart');
    setState(() {
      resultMessage = result;
    });
    channel.setMessageHandler((String? message) async {
      setState(() {
        receiveMessage = message;
      });
      return 'Reply from Dart';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Platform Interconnection Through Message Channel',
        ),
      ),
      body: Container(
        color: Colors.deepPurpleAccent,
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text('resultMessage : $resultMessage'),
              Text('receiveMessage : $receiveMessage'),
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
