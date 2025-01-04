import 'package:flutter/material.dart';

void main() {
  runApp(PageViewApp());
}

class PageViewApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Page View App'),
        ),
        body: PageViewWidget(),
      ),
    );
  }
}

class PageViewWidget extends StatefulWidget {
  @override
  State<PageViewWidget> createState() => _PageViewWidgetState();
}

class _PageViewWidgetState extends State<PageViewWidget> {
  PageController controller = PageController(
    initialPage: 1,
    viewportFraction: 1,
  );

  @override
  Widget build(BuildContext context) {
    return PageView(
      controller: controller,
      children: [
        Container(
            margin: EdgeInsets.all(20), color: Colors.greenAccent.shade100),
        Container(
            margin: EdgeInsets.all(20), color: Colors.greenAccent.shade200),
        Container(
            margin: EdgeInsets.all(20), color: Colors.greenAccent.shade400),
        Container(
            margin: EdgeInsets.all(20), color: Colors.greenAccent.shade700),
      ],
    );
  }
}
