import 'package:flutter/material.dart';
import 'package:sqflite/sqflite.dart';

void main() => runApp(NativePackageSqfliteApp());

class NativePackageSqfliteApp extends StatelessWidget {
  const NativePackageSqfliteApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: WidgetA(),
    );
  }
}

class WidgetA extends StatefulWidget {
  @override
  State<WidgetA> createState() => _WidgetAState();
}

class _WidgetAState extends State<WidgetA> {
  @override
  void initState() {
    super.initState();
    _createTable();
  }

  var db;
  int lastId = 0;

  _createTable() async {
    db = await openDatabase("native_package_sqflite.db", version: 1,
        onCreate: (Database db, int version) async {
      await db.execute('''
            CREATE TABLE User (
              id INTEGER PRIMARY KEY,
              name TEXT,
              address TEXT
            )
          ''');
    }, onUpgrade: (Database db, int oldVersion, int newVersion) {});
  }

  insert() async {
    lastId++;
    User user = User.fromData('name$lastId', 'seoul$lastId');
    lastId = await db.insert('User', user.toMap());
    print('${user.toMap()}');
  }

  update() async {
    User user = User.fromData('name${lastId - 1}', 'seoul${lastId - 1}');
    await db.update('User', user.toMap(), where: 'id=?', whereArgs: [lastId]);
  }

  delete() async {
    await db.delete('User', where: 'id=?', whereArgs: [lastId]);
    lastId--;
  }

  query() async {
    List<Map> maps = await db.query(
      'User',
      columns: ['id', 'name', 'address'],
    );
    List<User> users = List.empty(growable: true);
    maps.forEach((element) {
      users.add(User.fromMap(element as Map<String, Object?>));
    });
    if (maps.length > 0) {
      print('select : ${maps.first}');
    }
    users.forEach((user) {
      print('${user.name}');
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Native Package Sqflite App'),
      ),
      body: Container(
        color: Colors.indigo,
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              ElevatedButton(
                child: Text('insert'),
                onPressed: () {
                  insert();
                  print('insert pressed');
                },
              ),
              ElevatedButton(
                child: Text('update'),
                onPressed: () {
                  update();
                  print('update pressed');
                },
              ),
              ElevatedButton(
                child: Text('delete'),
                onPressed: () {
                  delete();
                  print('delete pressed');
                },
              ),
              ElevatedButton(
                child: Text('query'),
                onPressed: () {
                  query();
                  print('query pressed');
                },
              )
            ],
          ),
        ),
      ),
    );
  }
}

class User {
  int? id;
  String? name;
  String? address;

  Map<String, Object?> toMap() {
    var map = <String, Object?>{"name": name, "address": address};
    if (id != null) {
      map["id"] = id;
    }
    return map;
  }

  User.fromData(this.name, this.address);

  User.fromMap(Map<String, Object?> map) {
    id = map['id'] as int;
    name = map['name'] as String;
    address = map['address'] as String;
  }
}
