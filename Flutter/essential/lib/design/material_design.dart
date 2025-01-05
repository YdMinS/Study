import 'package:flutter/material.dart';

void main() {
  runApp(MaterialDesignApp());
}

class MaterialDesignApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(
          seedColor: Colors.blueAccent,
          primary: Colors.orangeAccent,
          primaryContainer: Colors.orangeAccent,
          onPrimary: Colors.blueAccent,
        ),
      ),
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Material Design App',
            style: TextStyle(
              color: Colors.blueAccent,
            ),
          ),
          backgroundColor: Colors.orangeAccent,
        ),
        body: Center(
          child: Column(
            children: [
              ElevatedButton(onPressed: () {}, child: Text('Button')),
              Checkbox(value: true, onChanged: (value) {}),
              Text('Material Design')
            ],
          ),
        ),
        floatingActionButton: FloatingActionButton(
          child: Icon(
            Icons.add,
            color: Colors.blueAccent,
          ),
          onPressed: () {},
        ),
      ),
    );
  }
}
