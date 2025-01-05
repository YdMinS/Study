import 'package:flutter/cupertino.dart';

void main() {
  runApp(CupertinoDesignApp());
}

class CupertinoDesignApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return CupertinoApp(
      debugShowCheckedModeBanner: false,
      home: CupertinoPageScaffold(
        navigationBar: CupertinoNavigationBar(
          middle: Text('Cupertino Design App'),
        ),
        child: ListView(
          children: [
            CupertinoButton(child: Text('Button'), onPressed: () {}),
            Center(
              child: Text('Cupertino Design'),
            )
          ],
        ),
      ),
    );
  }
}
