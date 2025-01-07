import 'package:flutter/material.dart';
import 'package:essential/navigation/screens/screen1.dart';
import 'package:essential/navigation/screens/screen2.dart';
import 'package:essential/navigation/screens/screen3.dart';
import 'package:essential/navigation/screens/screen4.dart';

void main() {
  runApp(OnGenerateRouteNavigationApp());
}

class OnGenerateRouteNavigationApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      initialRoute: '/one',
      routes: {
        '/one': (context) => Screen1(),
        '/two': (context) => Screen2(),
      },
      onGenerateRoute: (settings) {
        if (settings.name == '/three') {
          return MaterialPageRoute(
            builder: (context) => Screen3(),
            settings: settings,
          );
        } else if (settings.name == '/four') {
          return MaterialPageRoute(
            builder: (context) => Screen4(),
            settings: settings,
          );
        } else {
          return MaterialPageRoute(
            builder: (context) => Screen1(),
            settings: settings,
          );
        }
      },
    );
  }
}
