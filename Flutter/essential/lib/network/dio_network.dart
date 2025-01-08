import 'dart:async';
import 'dart:io';
import 'package:flutter/material.dart';
import 'package:dio/dio.dart';

void main() {
  runApp(DioNetworkApp());
}

class DioNetworkApp extends StatefulWidget {
  @override
  State<DioNetworkApp> createState() => _DioNetworkAppState();
}

class _DioNetworkAppState extends State<DioNetworkApp> {
  String result = '';

  dioTest() async {
    try {
      var dio = Dio(BaseOptions(
        baseUrl: "https://reqres.in/api/",
        connectTimeout: Duration(milliseconds: 5000),
        receiveTimeout: Duration(milliseconds: 5000),
        headers: {
          HttpHeaders.contentTypeHeader: 'application/json',
          HttpHeaders.acceptHeader: 'application/json'
        },
      ));

      List<Response<dynamic>> response = await Future.wait([
        dio.get('https://reqres.in/api/users?page=1'),
        dio.get('https://reqres.in/api/users?page=2')
      ]);

      response.forEach((element) {
        if (element.statusCode == 200) {
          setState(() {
            result = element.data.toString();
          });
        }
      });
    } catch (e) {
      print(e);
    }
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('Dio Network App'),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text('$result'),
              ElevatedButton(
                child: Text('Get Server Data'),
                onPressed: dioTest,
              )
            ],
          ),
        ),
      ),
    );
  }
}
