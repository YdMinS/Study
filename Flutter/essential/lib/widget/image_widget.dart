import 'package:flutter/material.dart';

void main() {
  runApp(ImageApp());
}

class ImageApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('Image App'),
        ),
        body: Column(
          children: [
            Image(image: AssetImage('assets/images/3x/ydmins.png')),
            Image(
              image: ResizeImage(AssetImage('assets/images/3x/ydmins.png'),
                  width: 50, height: 50),
            ),
            Image.asset('assets/images/2x/ydmins.png')
          ],
        ),
      ),
    );
  }
}
