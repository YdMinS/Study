import 'package:flutter/material.dart';

void main() {
  runApp(ViewListApp());
}

class ViewListApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'View List App',
          ),
        ),
        body:
            //ListViewWidget(),
            //ListViewHorizontalWidget(),
            //ListViewBuilderWidget(),
            //ListViewSeparatedWidget(),
            ListTitleWidget(),
      ),
    );
  }
}

class ListViewWidget extends StatefulWidget {
  @override
  State<ListViewWidget> createState() => _ListViewWidgetState();
}

class _ListViewWidgetState extends State<ListViewWidget> {
  @override
  Widget build(BuildContext context) {
    return ListView(
      children: [
        Container(
          height: 300,
          color: Colors.blueAccent.shade100,
        ),
        Container(
          height: 300,
          color: Colors.greenAccent.shade100,
        ),
        Container(
          height: 300,
          color: Colors.greenAccent.shade200,
        ),
        Container(
          height: 300,
          color: Colors.greenAccent.shade400,
        ),
        Container(
          height: 300,
          color: Colors.greenAccent.shade700,
        ),
      ],
    );
  }
}

class ListViewHorizontalWidget extends StatefulWidget {
  @override
  State<ListViewHorizontalWidget> createState() =>
      _ListViewHorizontalWidgetState();
}

class _ListViewHorizontalWidgetState extends State<ListViewHorizontalWidget> {
  @override
  Widget build(BuildContext context) {
    return ListView(
      scrollDirection: Axis.horizontal,
      children: [
        Container(width: 250, color: Colors.orangeAccent.shade100),
        Container(width: 250, color: Colors.orangeAccent.shade200),
        Container(width: 250, color: Colors.orangeAccent.shade400),
        Container(width: 250, color: Colors.orangeAccent.shade700),
      ],
    );
  }
}

class ListViewBuilderWidget extends StatefulWidget {
  @override
  State<ListViewBuilderWidget> createState() => _ListViewBuilderWidgetState();
}

class _ListViewBuilderWidgetState extends State<ListViewBuilderWidget> {
  List<String> idols = ['NEW JEANS', "AESPA", "FINKL", "Oh My Girl", "KARA"];
  List<Color> colors = [
    Colors.orangeAccent.shade100,
    Colors.orangeAccent.shade200,
    Colors.orangeAccent.shade400
  ];

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
        itemCount: idols.length,
        itemBuilder: (context, index) {
          return Container(
            padding: EdgeInsets.all(10),
            height: 100,
            color: colors[(index % 3).toInt()],
            child: Text(idols[index]),
          );
        });
  }
}

class ListViewSeparatedWidget extends StatefulWidget {
  @override
  State<ListViewSeparatedWidget> createState() =>
      _ListViewSeparatedWidgetState();
}

class _ListViewSeparatedWidgetState extends State<ListViewSeparatedWidget> {
  List<String> idols = ['NEW JEANS', "AESPA", "FINKL", "Oh My Girl", "KARA"];
  List<Color> colors = [
    Colors.orangeAccent.shade100,
    Colors.orangeAccent.shade200,
    Colors.orangeAccent.shade400
  ];

  @override
  Widget build(BuildContext context) {
    return ListView.separated(
      itemCount: idols.length,
      itemBuilder: (context, index) {
        return Container(
          padding: EdgeInsets.all(10),
          height: 100,
          color: colors[index % 3],
          child: Text(idols[index]),
        );
      },
      separatorBuilder: (context, index) {
        return Divider(height: 8, color: Colors.blueAccent);
      },
    );
  }
}

class ListTitleWidget extends StatefulWidget {
  @override
  State<ListTitleWidget> createState() => _ListTitleWidgetState();
}

class _ListTitleWidgetState extends State<ListTitleWidget> {
  List<String> users = ["Ani", "Bani", "Cani", "Dani", "Hani"];
  List<Color> colors1 = [
    Colors.blueAccent.shade100,
    Colors.blueAccent.shade200,
    Colors.blueAccent.shade400,
    Colors.blueAccent.shade700
  ];

  @override
  Widget build(BuildContext context) {
    return ListView.separated(
      itemCount: users.length,
      itemBuilder: (context, index) {
        return ListTile(
          leading: CircleAvatar(
            radius: 25,
            backgroundColor: colors1[index % 4],
          ),
          title: Text(users[index]),
          subtitle: Text('this is ${index}th'),
          trailing: Icon(Icons.more_vert),
          onTap: () {
            print(users[index]);
          },
        );
      },
      separatorBuilder: (context, index) {
        return Divider(height: 10, color: Colors.black45);
      },
    );
  }
}
