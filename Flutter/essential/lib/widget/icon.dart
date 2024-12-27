import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

void main() {
  runApp(IconApp());
}

const IconData alarm = IconData(0xe072, fontFamily: 'MaterialIcons');

class IconApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('Icon App'),
        ),
        body: Column(
          children: [
            Icon(
              IconData(0xe072, fontFamily: 'MaterialIcons'),
              size: 100,
              color: Colors.red,
            ),
            FaIcon(
              FontAwesomeIcons.bell,
              size: 100,
              color: Colors.blue,
            ),
            IconButton(
              onPressed: () {},
              icon: Icon(Icons.abc),
              iconSize: 100,
            ),
          ],
        ),
      ),
    );
  }
}
