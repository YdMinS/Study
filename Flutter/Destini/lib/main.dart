import 'package:flutter/material.dart';

void main() {
  runApp(const Destini());
}

class Destini extends StatelessWidget {
  const Destini({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Container(
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('images/background.png'),
            fit: BoxFit.cover,
          ),
        ),
        child: Scaffold(
          backgroundColor: Colors.transparent,
          body: SafeArea(
            child: Padding(
              padding: const EdgeInsets.all(10.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: [
                  Expanded(
                    flex: 5,
                    child: Center(
                      child: Text(
                        'Text',
                        textAlign: TextAlign.center,
                        style: TextStyle(fontSize: 25.0, color: Colors.white),
                      ),
                    ),
                  ),
                  Expanded(
                    child: Padding(
                      padding: EdgeInsets.all(15.0),
                      child: InkWell(
                        onTap: () {
                          print('Yes is tapped');
                        },
                        child: Container(
                          color: Colors.red,
                          child: Center(
                              child: Text(
                            'Yes',
                            style:
                                TextStyle(fontSize: 25.0, color: Colors.white),
                          )),
                        ),
                      ),
                    ),
                  ),
                  Expanded(
                    child: Padding(
                      padding: EdgeInsets.all(15.0),
                      child: GestureDetector(
                        onTap: () {
                          print('No is tapped');
                        },
                        child: Container(
                          color: Colors.blue,
                          child: Center(
                              child: Text(
                            'No',
                            style:
                                TextStyle(fontSize: 25.0, color: Colors.white),
                          )),
                        ),
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ),
        ),
      ),
    );
  }
}
