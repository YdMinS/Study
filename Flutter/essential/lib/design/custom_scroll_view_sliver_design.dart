import 'package:flutter/material.dart';

void main() {
  runApp(CustomScrollViewSliverApp());
}

class CustomScrollViewSliverApp extends StatefulWidget {
  @override
  State<CustomScrollViewSliverApp> createState() =>
      _CustomScrollViewSliverAppState();
}

class _CustomScrollViewSliverAppState extends State<CustomScrollViewSliverApp> {
  List<Widget> getWidgets() {
    List<Widget> widgets = [];
    for (var i = 0; i < 100; i++) {
      widgets.add(ListTile(
        title: Text(
          'This it item no.$i',
        ),
      ));
    }
    return widgets;
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        body: CustomScrollView(
          slivers: [
            SliverAppBar(
              leading: IconButton(
                icon: Icon(Icons.expand),
                onPressed: () {},
              ),
              expandedHeight: 200,
              floating: true,
              pinned: false,
              snap: true,
              elevation: 50,
              backgroundColor: Colors.blueGrey,
              flexibleSpace: Container(
                decoration: BoxDecoration(
                    image: DecorationImage(
                  image: AssetImage('assets/images/ydmins.png'),
                  fit: BoxFit.cover,
                )),
              ),
              title: Text('Custom Scroll View Sliver Design'),
              actions: [
                IconButton(
                  icon: const Icon(Icons.add_alert),
                  onPressed: () {},
                ),
                IconButton(
                  icon: const Icon(Icons.phone),
                  onPressed: () {},
                )
              ],
            ),
            SliverFixedExtentList(
              itemExtent: 50.0,
              delegate:
                  SliverChildBuilderDelegate((BuildContext context, int index) {
                return ListTile(
                  title: Text('This is item no.$index'),
                );
              }),
            )
          ],
        ),
      ),
    );
  }
}
