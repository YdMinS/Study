import 'package:flutter/material.dart';
import 'package:json_annotation/json_annotation.dart';
import 'dart:convert';

part 'json_serializable_parsing.g.dart';

void main() {
  runApp(JsonSerializableParsingApp());
}

class JsonSerializableParsingApp extends StatefulWidget {
  @override
  State<JsonSerializableParsingApp> createState() =>
      _JsonSerializableParsingAppState();
}

class _JsonSerializableParsingAppState
    extends State<JsonSerializableParsingApp> {
  String jsonStr =
      '{"id":1, "title": "HELLO", "completed": false, "location":{"latitude": "37.5", "longitude": "127.1"}}';
  Todo? todo;
  String result = '';

  onPressDecode() {
    Map<String, dynamic> map = jsonDecode(jsonStr);
    todo = Todo.fromJson(map);

    print(todo?.toJson());
    setState(() {
      result = "decode : ${todo?.toJson()}";
    });
  }

  onPressEncode() {
    setState(() {
      result = "encode : ${jsonEncode(todo)}";
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('JSON Serializable Parsing App'),
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
                onPressed: onPressEncode,
                child: Text('Encode'),
              )
            ],
          ),
        ),
      ),
    );
  }
}

@JsonSerializable()
class Location {
  String latitude;
  String longitude;

  Location(this.latitude, this.longitude);
  factory Location.fromJson(Map<String, dynamic> json) =>
      _$LocationFromJson(json);
  Map<String, dynamic> toJson() => _$LocationToJson(this);
}

@JsonSerializable(explicitToJson: true)
class Todo {
  @JsonKey(name: "id")
  int todoId;
  String title;
  bool completed;

  Location location;
  Todo(this.todoId, this.title, this.completed, this.location);
  factory Todo.fromJson(Map<String, dynamic> json) => _$TodoFromJson(json);
  Map<String, dynamic> toJson() => _$TodoToJson(this);
}
