import 'package:flutter/material.dart';
import 'package:essential/navigation/screens/user.dart';

class Screen2 extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Map<String, Object> args =
        ModalRoute.of(context)?.settings.arguments as Map<String, Object>;

    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Screen 2',
          ),
        ),
        body: Container(
          color: Colors.pinkAccent,
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  'Screen 2',
                  style: TextStyle(color: Colors.white, fontSize: 30),
                ),
                Text(
                    'sendData : ${args["arg1"]}, ${args["arg2"]}, ${(args["arg3"] as User).name}'),
                ElevatedButton(
                  child: Text('Go to screen 3'),
                  onPressed: () {
                    Navigator.pushNamed(context, '/three');
                  },
                ),
                ElevatedButton(
                  child: Text('POP'),
                  onPressed: () {
                    Navigator.pop(context, User('name2', 'gyeonggi'));
                  },
                )
              ],
            ),
          ),
        ),
      ),
    );
  }
}
