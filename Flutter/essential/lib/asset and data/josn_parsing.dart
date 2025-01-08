import 'package:flutter/material.dart';
import 'dart:convert';

void main() {
  runApp(JsonParsingApp());
}

class JsonParsingApp extends StatefulWidget {
  @override
  State<JsonParsingApp> createState() => _JsonParsingAppState();
}

class _JsonParsingAppState extends State<JsonParsingApp> {
  String jsonStr = '{"id": 1, "title": "HELLO", "completed": false}';
  Todo? todo;
  String result = '';

  onPressDecode() {
    Map<String, dynamic> map = jsonDecode(jsonStr);
    todo = Todo.fromJson(map);
    setState(() {
      result =
          "decode : id: ${todo?.id}, titld: ${todo?.title}, completed: ${todo?.completed}";
    });
  }

  onPressEndcoe() {
    setState(() {
      result = "encode : ${jsonEncode(todo)}";
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        backgroundColor: Colors.blueGrey,
        appBar: AppBar(
          title: Text('Json Parsing App'),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text('$result'),
              ElevatedButton(
                onPressed: onPressDecode,
                child: Text('Decode'),
              ),
              ElevatedButton(
                onPressed: onPressEndcoe,
                child: Text('Encode'),
              )
            ],
          ),
        ),
      ),
    );
  }
}

class Todo {
  int id;
  String title;
  bool completed;

  Todo(this.id, this.title, this.completed);

  Todo.fromJson(Map<String, dynamic> json)
      : id = json['id'],
        title = json['title'],
        completed = json['completed'];

  Map<String, dynamic> toJson() =>
      {'id': id, 'title': title, 'completed': completed};
}
