import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

void main() => runApp(NativePackageSharedPreferencesApp());

class NativePackageSharedPreferencesApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: WidgetA(),
    );
  }
}

class WidgetA extends StatefulWidget {
  @override
  State<WidgetA> createState() => _WidgetAState();
}

class _WidgetAState extends State<WidgetA> {
  late SharedPreferences prefs;

  double sliderValue = 0.0;
  bool switchValue = false;

  _save() async {
    await prefs.setDouble('slider', sliderValue);
    await prefs.setBool('switch', switchValue);
  }

  getInitDate() async {
    prefs = await SharedPreferences.getInstance();
    sliderValue = prefs.getDouble('slider') ?? 0.0;
    switchValue = prefs.getBool('switch') ?? false;
    setState(() {});
  }

  @override
  void initState() {
    super.initState();
    getInitDate();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Native Package Shared Preferences App'),
      ),
      body: Container(
        color: Colors.green,
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Slider(
                value: sliderValue,
                min: 0,
                max: 10,
                onChanged: (double value) {
                  setState(() {
                    sliderValue = value;
                  });
                },
              ),
              Switch(
                value: switchValue,
                onChanged: (bool value) {
                  setState(() {
                    switchValue = value;
                  });
                },
              ),
              ElevatedButton(
                child: Text('SAVE'),
                onPressed: () {
                  print('Button \'SAVE\' is hit');
                },
              )
            ],
          ),
        ),
      ),
    );
  }
}
