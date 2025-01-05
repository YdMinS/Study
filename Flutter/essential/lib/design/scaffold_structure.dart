import 'package:flutter/material.dart';

void main() {
  runApp(ScaffoldStructureApp());
}

class ScaffoldStructureApp extends StatefulWidget {
  @override
  State<ScaffoldStructureApp> createState() => _ScaffoldStructureAppState();
}

class _ScaffoldStructureAppState extends State<ScaffoldStructureApp> {
  int _selectedIndex = 0;

  List<Widget> _widgetOptions = <Widget>[
    Text(
      'First Screen',
      style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold),
    ),
    Text(
      'Second Screen',
      style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold),
    ),
    Text(
      'Third Screen',
      style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold),
    ),
    Text(
      'Fourth Screen',
      style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold),
    )
  ];

  void _onItemTapped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          flexibleSpace: Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage('assets/images/ydmins.png'),
                fit: BoxFit.cover,
              ),
            ),
          ),
          bottom: PreferredSize(
            preferredSize: const Size.fromHeight(48.0),
            child: Container(
              color: Colors.transparent,
              height: 48.0,
              alignment: Alignment.center,
              child: Text(
                'AppBar Bottom Text',
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                  color: Colors.blueGrey,
                ),
              ),
            ),
          ),
          title: Text(
            'Scaffold Structure App',
            style:
                TextStyle(fontWeight: FontWeight.bold, color: Colors.blueGrey),
          ),
          actions: [
            IconButton(
              icon: const Icon(
                Icons.add_alert,
                color: Colors.blueGrey,
              ),
              onPressed: () {},
            ),
            IconButton(
              icon: const Icon(
                Icons.phone,
                color: Colors.blueGrey,
              ),
              onPressed: () {},
            )
          ],
        ),
        body: Container(),
        bottomNavigationBar: BottomNavigationBar(
          type: BottomNavigationBarType.shifting,
          items: [
            BottomNavigationBarItem(
              icon: Icon(
                Icons.home,
                color: Colors.white38,
              ),
              label: 'Home',
              backgroundColor: Colors.blueGrey.shade700,
            ),
            BottomNavigationBarItem(
              icon: Icon(
                Icons.business,
                color: Colors.white38,
              ),
              label: 'Location',
              backgroundColor: Colors.blueGrey.shade700,
            ),
            BottomNavigationBarItem(
              icon: Icon(
                Icons.phone,
                color: Colors.white38,
              ),
              label: 'Phone',
              backgroundColor: Colors.blueGrey.shade700,
            ),
            BottomNavigationBarItem(
              icon: Icon(
                Icons.email,
                color: Colors.white38,
              ),
              label: 'Email',
              backgroundColor: Colors.blueGrey.shade700,
            )
          ],
          currentIndex: _selectedIndex,
          selectedItemColor: Colors.white,
          onTap: _onItemTapped,
        ),
        drawer: Drawer(
          child: ListView(
            padding: EdgeInsets.zero,
            children: [
              DrawerHeader(
                decoration: BoxDecoration(
                  color: Colors.blueGrey.shade700,
                ),
                child: Text('Drawer Header'),
              ),
              ListTile(
                title: Text('Item 1'),
                onTap: () {},
              ),
              ListTile(
                title: Text('Item 2'),
                onTap: () {},
              )
            ],
          ),
        ),
      ),
    );
  }
}
