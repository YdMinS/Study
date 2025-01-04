import 'package:flutter/material.dart';

void main() {
  runApp(GridViewApp());
}

class GridViewApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Grid View App'),
        ),
        body:
            //GridViewWidget(),
            GridViewHorizontalWidget(),
      ),
    );
  }
}

class GridViewWidget extends StatefulWidget {
  @override
  State<GridViewWidget> createState() => _GridViewWidgetState();
}

class _GridViewWidgetState extends State<GridViewWidget> {
  List<String> korea = [
    'Seoul',
    'Gyeonggi',
    'Incheon',
    'Jeju',
    'Jeonla',
    'Chungcheong',
    'Gangwon',
    'Gyeongsang'
  ];
  List<Color> colors = [
    Colors.orangeAccent.shade100,
    Colors.orangeAccent.shade200,
    Colors.orangeAccent.shade400,
    Colors.orangeAccent.shade700,
  ];

  @override
  Widget build(BuildContext context) {
    return GridView.builder(
      itemCount: korea.length,
      itemBuilder: (context, index) {
        return Card(
          color: colors[index % 4],
          child: Text(korea[index]),
        );
      },
      gridDelegate:
          SliverGridDelegateWithFixedCrossAxisCount(crossAxisCount: 2),
    );
  }
}

class GridViewHorizontalWidget extends StatefulWidget {
  @override
  State<GridViewHorizontalWidget> createState() =>
      _GridViewHorizontalWidgetState();
}

class _GridViewHorizontalWidgetState extends State<GridViewHorizontalWidget> {
  List<String> korea = [
    'Seoul',
    'Gyeonggi',
    'Incheon',
    'Jeju',
    'Jeonla',
    'Chungcheong',
    'Gangwon',
    'Gyeongsang'
  ];
  List<Color> colors = [
    Colors.orangeAccent.shade100,
    Colors.orangeAccent.shade200,
    Colors.orangeAccent.shade400,
    Colors.orangeAccent.shade700,
  ];
  @override
  Widget build(BuildContext context) {
    return GridView.builder(
      scrollDirection: Axis.horizontal,
      itemCount: korea.length,
      itemBuilder: (context, index) {
        return Card(
          color: colors[index % 4],
          child: Text(korea[index]),
        );
      },
      gridDelegate:
          SliverGridDelegateWithFixedCrossAxisCount(crossAxisCount: 2),
    );
  }
}
