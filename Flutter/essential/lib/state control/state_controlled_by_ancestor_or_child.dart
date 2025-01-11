import 'package:flutter/material.dart';

void main() {
  runApp(RootWidget());
}

class RootWidget extends StatefulWidget {
  @override
  State<RootWidget> createState() => _RootWidgetState();
}

class _RootWidgetState extends State<RootWidget> {
  bool favorite = false;
  int favoriteCnt = 10;

  GlobalKey<_ChildWidgetState> childKey = GlobalKey();
  int childCnt = 0;

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

  void getChildData() {
    _ChildWidgetState? childState = childKey.currentState;
    setState(() {
      childCnt = childState?.childCnt ?? 0;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('State Controlled by Ancestor or Child App'),
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Container(
                  child: Text(
                    '[Parent] child : $childCnt',
                  ),
                ),
                ElevatedButton(
                  child: Text('get child data'),
                  onPressed: getChildData,
                )
              ],
            ),
            ChildWidget(key: childKey),
            IconWidget(),
            ContentWidget()
          ],
        ),
      ),
    );
  }
}

class ChildWidget extends StatefulWidget {
  const ChildWidget({super.key});

  @override
  State<ChildWidget> createState() => _ChildWidgetState();
}

class _ChildWidgetState extends State<ChildWidget> {
  int childCnt = 0;

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Container(
          child: Text('Child : $childCnt}'),
        ),
        ElevatedButton(
          child: Text('increment'),
          onPressed: () {
            setState(() {
              childCnt++;
            });
          },
        )
      ],
    );
  }
}

class IconWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    _RootWidgetState? state =
        context.findAncestorStateOfType<_RootWidgetState>();
    return Center(
      child: IconButton(
        icon: ((state?.favorite ?? false))
            ? Icon(Icons.favorite)
            : Icon(Icons.favorite_border),
        iconSize: 200,
        color: Colors.green,
        onPressed: state?.toggleFavorite,
      ),
    );
  }
}

class ContentWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    _RootWidgetState? state =
        context.findAncestorStateOfType<_RootWidgetState>();
    return Center(
      child: Text(
        'favorite : ${state?.favoriteCnt}',
        style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
      ),
    );
  }
}
