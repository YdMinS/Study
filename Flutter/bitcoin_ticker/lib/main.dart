import 'package:flutter/material.dart';

void main() {
  runApp(BitCoinTicker());
}

class BitCoinTicker extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(
          seedColor: Colors.blueAccent,
          primary: Colors.orangeAccent,
          primaryContainer: Colors.orangeAccent,
          onPrimary: Colors.blueAccent,
        ),
      ),
      home: Scaffold(),
    );
  }
}
