import 'package:flutter/material.dart';

void main() {
  runApp(StateControlledByParentApp());
}

class StateControlledByParentApp extends StatefulWidget {
  @override
  State<StateControlledByParentApp> createState() =>
      _StateControlledByParentAppState();
}

class _StateControlledByParentAppState
    extends State<StateControlledByParentApp> {
  bool favorite = false;
  int favoriteCnt = 10;

  void toggleFavorite() {
    setState(() {
      if (favorite) {
        favoriteCnt--;
        favorite = false;
      } else {
        favoriteCnt++;
        favorite = true;
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'State Controlled by Parent APP',
          ),
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            IconWidget(
              favorite: favorite,
              onChanged: toggleFavorite,
            ),
            ContentWidget(
              favoriteCount: favoriteCnt,
            )
          ],
        ),
      ),
    );
  }
}

class IconWidget extends StatelessWidget {
  final bool favorite;
  final Function onChanged;

  const IconWidget({required this.favorite, required this.onChanged});

  void _handleTap() {
    onChanged();
  }

  @override
  Widget build(BuildContext context) {
    return Center(
      child: IconButton(
        icon: (favorite ? Icon(Icons.favorite) : Icon(Icons.favorite_border)),
        iconSize: 200,
        color: Colors.red,
        onPressed: _handleTap,
      ),
    );
  }
}

class ContentWidget extends StatelessWidget {
  final int favoriteCount;

  const ContentWidget({required this.favoriteCount});

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Container(
          child: Text(
            'favoriteCount : $favoriteCount',
            style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
          ),
        )
      ],
    );
  }
}
