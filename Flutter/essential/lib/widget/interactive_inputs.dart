import 'package:flutter/material.dart';

void main() {
  runApp(InteractiveInputApp());
}

class InteractiveInputApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('Interactive Input App'),
        ),
        body: InteractiveInputs(),
      ),
    );
  }
}

class InteractiveInputs extends StatefulWidget {
  @override
  State<InteractiveInputs> createState() => _InteractiveInputsState();
}

class _InteractiveInputsState extends State<InteractiveInputs> {
  bool? isChecked = false;
  String? selectPlatform = "Please select above";
  double selectValue = 0.0;
  bool isSwitched = true;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Row(
          children: [
            Checkbox(
              value: isChecked,
              onChanged: (bool? value) {
                setState(() {
                  isChecked = value;
                });
              },
            ),
            Text(
              'checkbox value is $isChecked',
            )
          ],
        ), // Check box
        Row(
          children: [
            Radio(
              value: 'android',
              groupValue: selectPlatform,
              onChanged: (String? i) {
                setState(() {
                  selectPlatform = i;
                });
              },
            ),
            Text('android')
          ],
        ), // Radio 1
        Row(
          children: [
            Radio(
                value: 'ios',
                groupValue: selectPlatform,
                onChanged: (String? value) {
                  setState(() {
                    selectPlatform = value;
                  });
                }),
            Text(
              'ios',
            )
          ],
        ), // Radio 2
        Text('selected platform is : $selectPlatform'), // Radio Text
        Slider(
          value: selectValue,
          onChanged: (double value) {
            setState(() {
              selectValue = value;
            });
          },
          max: 100.0,
          min: -100.0,
        ),
        Text('selected value is : $selectValue'), // Slider Text
        Switch(
          value: isSwitched,
          onChanged: (bool switched) {
            setState(() {
              isSwitched = switched;
            });
          },
        ),
        Text('switched value is : ${isSwitched}'), // Switch Text
      ],
    );
  }
}
