import 'package:flutter/material.dart';
import 'package:essential/navigation/screens/screen1.dart';
import 'package:essential/navigation/screens/screen2.dart';
import 'package:essential/navigation/screens/screen3.dart';
import 'package:essential/navigation/screens/screen4.dart';

void main() {
  runApp(RoutesNavigationApp());
}

class RoutesNavigationApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      initialRoute: '/one',
      routes: {
        '/one': (context) => Screen1(),
        '/two': (context) => Screen2(),
        '/three': (context) => Screen3(),
        '/four': (context) => Screen4(),
      },
    );
  }
}
