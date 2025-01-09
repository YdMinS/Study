import 'dart:async';
import 'package:flutter/material.dart';

void main() {
  runApp(AsyncAwaitApp());
}

class AsyncAwaitApp extends StatelessWidget {
  Future<int> futureA() {
    return Future.delayed(Duration(seconds: 3), () {
      return 10;
    });
  }

  Future<int> futureB(int num) {
    return Future.delayed(Duration(seconds: 2), () {
      return 2 + num;
    });
  }

  Future<int> futureOfFuture() async {
    int a = await futureA();
    int b = await futureB(a);
    return b;
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Async Await App',
          ),
        ),
        body: Center(
          child: FutureBuilder(
            future: futureOfFuture(),
            builder: (context, snapshot) {
              if (snapshot.hasData) {
                return Center(
                  child: Text(
                    '${snapshot.data}',
                    style: TextStyle(
                      fontSize: 30,
                      color: Colors.greenAccent,
                    ),
                  ),
                );
              }
              return Center(
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    SizedBox(
                      width: 100,
                      height: 100,
                      child: CircularProgressIndicator(),
                    ),
                    Container(
                      margin: EdgeInsets.only(top: 30),
                      child: Text(
                        '...waiting',
                        style: TextStyle(
                          color: Colors.indigo,
                          fontSize: 20,
                        ),
                      ),
                    )
                  ],
                ),
              );
            },
          ),
        ),
      ),
    );
  }
}
