import 'dart:async';
import 'package:flutter/material.dart';

void main() {
  runApp(AsyncFutureBuilderApp());
}

class AsyncFutureBuilderApp extends StatelessWidget {
  Future<String> sum() {
    return Future<String>(() {
      var sum = 0;
      for (int i = 0; i < 5000000000; i++) {
        sum += i;
      }
      return DateTime.now().toString();
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Async Future Builder App',
          ),
        ),
        body: FutureBuilder(
          future: sum(),
          builder: (context, snapshot) {
            if (snapshot.hasData) {
              return Center(
                child: Text(
                  '${snapshot.data}',
                  style: TextStyle(
                    color: Colors.indigo,
                    fontSize: 20.0,
                  ),
                ),
              );
            }
            return Center(
              child: Text(
                'waiting',
                style: TextStyle(
                  color: Colors.indigo,
                  fontSize: 30.0,
                ),
              ),
            );
          },
        ),
      ),
    );
  }
}
