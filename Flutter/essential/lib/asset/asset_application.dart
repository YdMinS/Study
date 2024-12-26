import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

void main() {
  runApp(AssetApp());
}

class AssetApp extends StatelessWidget {
  Future<String> useRootBundle() async {
    return await rootBundle.loadString('assets/text/asset_application.txt');
  }

  Future<String> useDefaultAssetBundle(BuildContext context) async {
    return await DefaultAssetBundle.of(context)
        .loadString('assets/text/asset_application.txt');
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Text'),
        ),
        body: Column(children: [
          Image.asset('assets/images/ydmins.png'),
          FutureBuilder(
            future: useRootBundle(),
            builder: (context, snapshot) {
              return Text('rootBundle : ${snapshot}');
            },
          ),
          FutureBuilder(
            future: useDefaultAssetBundle(context),
            builder: (context, snapshot) {
              return Text('DefaultAssetBundle : ${snapshot}');
            },
          ),
        ]),
      ),
    );
  }
}
