import 'package:flutter/material.dart';

void main() {
  runApp(ViewTabbarApp());
}

class ViewTabbarApp extends StatefulWidget {
  @override
  State<ViewTabbarApp> createState() => _ViewTabbarAppState();
}

class _ViewTabbarAppState extends State<ViewTabbarApp>
    with SingleTickerProviderStateMixin {
  late TabController controller;

  @override
  void initState() {
    super.initState();
    controller = TabController(length: 3, vsync: this);
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('View Tabbar App'),
          bottom: TabBar(
            controller: controller,
            tabs: [
              Tab(text: 'one'),
              Tab(text: 'two'),
              Tab(text: 'three'),
            ],
          ),
        ),
        body: TabBarView(
          controller: controller,
          children: [
            Center(
              child: Container(
                child: Text('One'),
              ),
            ),
            Center(
              child: Container(
                child: Text('Two'),
              ),
            ),
            Center(
              child: Container(
                child: Text('Three'),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
