import 'package:flutter/material.dart';

void main() {
  runApp(ContainerCenterApp());
}

class ContainerCenterApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      appBar: AppBar(
        title: Text('Container Center App'),
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            Container(
              width: 100,
              height: 100,
              color: Colors.orange,
            ),
            Container(
              decoration: BoxDecoration(
                border: Border.all(width: 10, color: Colors.deepOrangeAccent),
                borderRadius: BorderRadius.all(const Radius.circular(9)),
              ),
              margin: const EdgeInsets.all(10),
              padding: EdgeInsets.all(20),
              child: Image.asset('assets/images/3x/ydmins.png'),
            ),
            Container(
              margin: EdgeInsets.all(10.0),
              decoration: BoxDecoration(
                color: Colors.teal,
                shape: BoxShape.circle,
              ),
              width: 120,
              height: 120,
            ),
            Container(
              margin: EdgeInsets.all(8),
              decoration: BoxDecoration(
                shape: BoxShape.circle,
                image: DecorationImage(
                  image: AssetImage('assets/images/3x/ydmins.png'),
                  fit: BoxFit.cover,
                ),
              ),
              width: 100,
              height: 100,
            ),
            Container(
              height: 400,
              decoration: BoxDecoration(
                gradient: LinearGradient(
                  begin: Alignment.topRight,
                  end: Alignment.bottomCenter,
                  colors: [
                    Colors.teal,
                    Colors.orangeAccent,
                  ],
                ),
              ),
              child: Center(
                child: Text(
                  'YdMinS',
                  style: TextStyle(
                      fontSize: 40,
                      fontWeight: FontWeight.bold,
                      color: Colors.greenAccent),
                ),
              ),
            ),
            Container(
              color: Colors.blueAccent,
              child: Center(
                heightFactor: 2,
                widthFactor: 2,
                child: Image.asset(
                  'assets/images/2x/ydmins.png',
                  width: 150,
                  height: 150,
                  fit: BoxFit.fill,
                ),
              ),
            )
          ],
        ),
      ),
    ));
  }
}
