import 'package:flutter/material.dart';

void main() {
  runApp(RouterDelegateNavigationApp());
}

class RouterDelegateNavigationApp extends StatefulWidget {
  @override
  State<RouterDelegateNavigationApp> createState() =>
      _RouterDelegateNavigationAppState();
}

class _RouterDelegateNavigationAppState
    extends State<RouterDelegateNavigationApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp.router(
      routerDelegate: MyRouterDelegate(),
      routeInformationParser: MyRouteInformationParser(),
    );
  }
}

class MyRoutePath {
  String? id;

  MyRoutePath.home() : this.id = null;
  MyRoutePath.detail(this.id);
}

class MyRouteInformationParser extends RouteInformationParser<MyRoutePath> {
  @override
  Future<MyRoutePath> parseRouteInformation(
      RouteInformation routeInformation) async {
    final uri = Uri.parse(routeInformation.uri.toString() ?? '/');
    if (uri.pathSegments.length >= 2) {
      var remaining = uri.pathSegments[1];
      return MyRoutePath.detail(remaining);
    } else {
      return MyRoutePath.home();
    }
  }

  @override
  RouteInformation? restoreRouteInformation(MyRoutePath configuration) {
    if (configuration.id != null) {
      return RouteInformation(uri: Uri.parse('/detail/${configuration.id}'));
    } else {
      return RouteInformation(uri: Uri.parse('/'));
    }
  }
}

class MyRouterDelegate extends RouterDelegate<MyRoutePath>
    with ChangeNotifier, PopNavigatorRouterDelegateMixin<MyRoutePath> {
  String? selectId;
  final GlobalKey<NavigatorState> navigatorKey = GlobalKey<NavigatorState>();

  @override
  MyRoutePath get currentConfiguration {
    if (selectId != null) {
      return MyRoutePath.detail(selectId);
    } else {
      return MyRoutePath.home();
    }
  }

  @override
  Widget build(BuildContext context) {
    return Navigator(
      key: navigatorKey,
      pages: [
        MaterialPage(child: HomeScreen(_handleOnPressed)),
        if (selectId != null)
          MaterialPage(
            child: DetailScreen(selectId),
          )
      ],
      onPopPage: (route, result) {
        if (!route.didPop(result)) {
          return false;
        }
        selectId = null;
        notifyListeners();
        return true;
      },
    );
  }

  @override
  Future<void> setNewRoutePath(MyRoutePath configuration) async {
    if (configuration.id != null) {
      selectId = configuration.id;
    }
  }

  void _handleOnPressed(String id) {
    selectId = id;
    notifyListeners();
  }
}

class HomeScreen extends StatelessWidget {
  final ValueChanged<String> onPressed;

  HomeScreen(this.onPressed);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Container(
        color: Colors.teal,
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text(
                'Home Screen',
                style: TextStyle(color: Colors.white, fontSize: 30),
              ),
              ElevatedButton(
                child: Text('Go Detail1'),
                onPressed: () => onPressed('1'),
              ),
              ElevatedButton(
                child: Text('Go Detail2'),
                onPressed: () => onPressed('2'),
              )
            ],
          ),
        ),
      ),
    );
  }
}

class DetailScreen extends StatelessWidget {
  String? id;

  DetailScreen(this.id);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Container(
        color: Colors.amber,
        child: Text(
          'Detail $id',
          style: TextStyle(
            color: Colors.white,
            fontSize: 30,
          ),
        ),
      ),
    );
  }
}
