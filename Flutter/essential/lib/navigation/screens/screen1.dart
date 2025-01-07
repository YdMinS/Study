import 'package:flutter/material.dart';

class Screen1 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Screen 1',
          ),
        ),
        body: Container(
          color: Colors.yellowAccent,
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  'Screen 1',
                  style: TextStyle(color: Colors.white, fontSize: 30),
                ),
                ElevatedButton(
                  child: Text('Go to screen 2'),
                  onPressed: () {
                    Navigator.pushNamed(context, '/two');
                  },
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
