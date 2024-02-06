import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Container(
        decoration: const BoxDecoration(
          image: DecorationImage(
            fit: BoxFit.fill,
            image: AssetImage('assets/elements/background_image.jpg'),
          ),
        ),
        child: const Scaffold(
          backgroundColor: Colors.transparent,
        ),
      ),
    ),
  );
}
