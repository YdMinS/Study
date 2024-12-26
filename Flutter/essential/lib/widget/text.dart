import 'package:flutter/material.dart';

void main() {
  runApp(TextApp());
}

class TextApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('Text App'),
        ),
        body: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Text('plane text'),
            Text(
              'center aligned text',
              textAlign: TextAlign.center,
            ),
            Text(
              'styled text',
              style: TextStyle(
                fontWeight: FontWeight.bold,
                fontStyle: FontStyle.italic,
                color: Colors.blueAccent,
                fontSize: 19,
                height: 2.1,
                backgroundColor: Colors.grey.shade300,
                decoration: TextDecoration.underline,
                decorationColor: Colors.yellow,
              ),
            ),
            Text(
              'long text in the limited line number long text in the limited line number long text in the limited line number long text in the limited line number long text in the limited line number ',
              style: TextStyle(
                fontSize: 15,
              ),
              maxLines: 2,
              overflow: TextOverflow.ellipsis,
            ),
            Text.rich(
              TextSpan(text: 'text', children: [
                TextSpan(
                    text: ' sp',
                    style: TextStyle(fontStyle: FontStyle.italic),
                    children: [
                      TextSpan(text: 'A'),
                      TextSpan(
                          text: 'N',
                          style: TextStyle(
                            color: Colors.blue,
                          ))
                    ])
              ]),
              style: TextStyle(fontSize: 20),
            ),
            RichText(
                text: TextSpan(
                    text: 'SP',
                    style: TextStyle(
                      fontSize: 20,
                      color: Colors.red,
                    ),
                    children: [
                  TextSpan(
                    text: 'A',
                  ),
                  TextSpan(
                      text: 'Ned ',
                      style: TextStyle(
                        fontSize: 15,
                        color: Colors.teal,
                      )),
                  TextSpan(
                      text: 'text',
                      style: TextStyle(
                        color: Colors.orange,
                      ))
                ]))
          ],
        ),
      ),
    );
  }
}
