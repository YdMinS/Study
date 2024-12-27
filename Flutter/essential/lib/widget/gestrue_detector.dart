import 'package:flutter/material.dart';

void main() {
  runApp(GestureDetectorApp());
}

class GestureDetectorApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        debugShowCheckedModeBanner: false,
        home: Scaffold(
          appBar: AppBar(
            title: Text(
              'Gesture Detector App',
            ),
          ),
          body: Column(
            children: [
              GestureDetector(
                child: Image.asset('assets/images/3x/ydmins.png'),
                onVerticalDragStart: (DragStartDetails details) {
                  print('vertical drag start ... global position :'
                      '${details.globalPosition.dx}, '
                      '${details.globalPosition.dy} ');
                  print('vertical drag start ... local position :'
                      '${details.localPosition.dx}, '
                      '${details.localPosition.dy}');
                },
              ),
              ElevatedButton(onPressed: () {}, child: Text('Click')),
              ElevatedButton(onPressed: null, child: Text('Disabled')),
              ElevatedButton(
                onPressed: () {},
                style: ButtonStyle(
                  backgroundColor: WidgetStateProperty.all(Colors.red),
                ),
                child: Text(
                  'Cancel',
                  style: TextStyle(
                    color: Colors.white,
                  ),
                ),
              ),
            ],
          ),
        ));
  }
}
