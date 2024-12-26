import 'package:flutter/material.dart';

void main() {
  runApp(KeyApp());
}

class KeyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: ColorListWidget(),
    );
  }
}

class ColorListWidget extends StatefulWidget {
  @override
  State<ColorListWidget> createState() => _ColorListWidgetState();
}

class _ColorListWidgetState extends State<ColorListWidget> {
  List<Widget> widgetList = [
    ColorWidgetItem(Colors.red, key: UniqueKey()),
    ColorWidgetItem(Colors.blue, key: UniqueKey())
  ];

  onChange() {
    setState(() {
      widgetList.insert(1, widgetList.removeAt(0));
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Key'),
      ),
      body: Column(
        children: [
          Row(
            children: widgetList,
          ),
          ElevatedButton(onPressed: onChange, child: Text("toggle"))
        ],
      ),
    );
  }
}

class ColorWidgetItem extends StatefulWidget {
  Color color;
  ColorWidgetItem(this.color, {Key? key}) : super(key: key);
  @override
  State<ColorWidgetItem> createState() => _ColorWidgetItemState(color);
}

class _ColorWidgetItemState extends State<ColorWidgetItem> {
  Color color;
  _ColorWidgetItemState(this.color);
  @override
  Widget build(BuildContext context) {
    return Expanded(
        child: Container(
      color: color,
      width: 150,
      height: 150,
    ));
  }
}
