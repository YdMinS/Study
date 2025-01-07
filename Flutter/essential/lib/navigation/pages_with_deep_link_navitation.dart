import 'package:flutter/material.dart';

void main() {
  runApp(PagesWithDeepLinkNavigationApp());
}

class PagesWithDeepLinkNavigationApp extends StatelessWidget {
  final bool _isDeepLink = true;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Pages With Deep Link Navigation App',
      home: Navigator(
        pages: [
          MaterialPage(
            child: ScreenA(),
          ),
          if (_isDeepLink)
            MaterialPage(
              child: ScreenB(),
            )
        ],
        onPopPage: (route, result) => route.didPop(result),
      ),
    );
  }
}

class ScreenA extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Screen A'),
      ),
      body: Container(
        color: Colors.pinkAccent,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Center(
              child: Text(
                'Screen A',
                style: TextStyle(
                  color: Colors.blue,
                  fontSize: 20,
                ),
              ),
            )
          ],
        ),
      ),
    );
  }
}

class ScreenB extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Screen B'),
      ),
      body: Container(
        color: Colors.pinkAccent,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Center(
              child: Text(
                'Screen A',
                style: TextStyle(color: Colors.blue, fontSize: 20),
              ),
            ),
            ElevatedButton(
              onPressed: () {
                Navigator.pop(context);
              },
              child: Text('Pop'),
            )
          ],
        ),
      ),
    );
  }
}
