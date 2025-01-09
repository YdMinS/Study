import 'dart:async';
import 'package:flutter/material.dart';

void main() {
  runApp(AsyncStreamApp());
}

class AsyncStreamApp extends StatelessWidget {
  int power(int x) {
    return x * x;
  }

  Stream<int> powerStream() {
    Duration duration = Duration(milliseconds: 1500);
    Stream<int> stream = Stream<int>.periodic(duration, power);
    return stream.take(5);
  }

  Text toText(String txt) {
    return Text(
      txt,
      style: TextStyle(
        fontSize: 30.0,
        color: Colors.lightBlue,
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Async Stream App',
          ),
        ),
        body: Center(
          child: StreamBuilder(
              stream: powerStream(),
              builder: (BuildContext context, AsyncSnapshot<int> snapshot) {
                if (snapshot.connectionState == ConnectionState.done) {
                  return toText('Completed');
                } else if (snapshot.connectionState ==
                    ConnectionState.waiting) {
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
                          child: toText('...waiting'),
                        )
                      ],
                    ),
                  );
                }
                return Center(
                  child: toText('${snapshot.data}'),
                );
              }),
        ),
      ),
    );
  }
}
