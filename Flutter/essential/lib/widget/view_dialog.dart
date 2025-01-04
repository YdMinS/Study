import 'dart:math';

import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      home: ViewDialogApp(),
    ),
  );
}

class ViewDialogApp extends StatefulWidget {
  @override
  State<ViewDialogApp> createState() => _ViewDialogAppState();
}

class _ViewDialogAppState extends State<ViewDialogApp> {
  DateTime? pickedDate;
  TimeOfDay? pickedTime;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('View Dialog App'),
      ),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: [
          TextButton(
            child: Text('Basic Dialog'),
            onPressed: () {
              showDialog(
                context: context,
                barrierDismissible: false,
                builder: (BuildContext context) {
                  return ViewDialogBasicWidget();
                },
              );
            },
          ),
          TextButton(
            child: Text('Bottom Sheet'),
            onPressed: () {
              showModalBottomSheet(
                context: context,
                backgroundColor: Colors.yellow,
                builder: (context) {
                  return ViewBottomSheetWidget();
                },
              );
            },
          ),
          TextButton(
            child: Text('Date Pick'),
            onPressed: () async {
              DateTime? date = await showDatePicker(
                  context: context,
                  initialDate: new DateTime.now(),
                  firstDate: new DateTime(2015),
                  lastDate: new DateTime.now());
              if (date != null) {
                setState(() {
                  pickedDate = date;
                });
              }
            },
          ),
          Text(
            pickedDate != null ? pickedDate.toString() : "",
            textAlign: TextAlign.center,
          ),
          TextButton(
            child: Text('Time Pick'),
            onPressed: () async {
              TimeOfDay? time = await showTimePicker(
                  context: context, initialTime: TimeOfDay.now());
              if (time != null) {
                setState(() {
                  pickedTime = time;
                });
              }
            },
          ),
          Text(
            pickedTime != null ? pickedTime.toString() : "",
            textAlign: TextAlign.center,
          )
        ],
      ),
    );
  }
}

class ViewDialogBasicWidget extends StatefulWidget {
  @override
  State<ViewDialogBasicWidget> createState() => _ViewDialogBasicWidgetState();
}

class _ViewDialogBasicWidgetState extends State<ViewDialogBasicWidget> {
  bool isChecked = false; // 체크박스 상태 관리

  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      title: Text('Dialog Title'),
      content: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          TextField(
            decoration: InputDecoration(
              border: OutlineInputBorder(),
            ),
          ),
          Row(
            children: [
              Checkbox(
                value: isChecked,
                onChanged: (value) {
                  setState(() {
                    isChecked = value ?? false; // 체크박스 상태 업데이트
                  });
                },
              ),
              Text('동의'),
            ],
          ),
        ],
      ),
      actions: [
        TextButton(
          onPressed: () {
            Navigator.of(context).pop();
          },
          child: Text("OK"),
        ),
      ],
    );
  }
}

class ViewBottomSheetWidget extends StatefulWidget {
  @override
  State<ViewBottomSheetWidget> createState() => _ViewBottomSheetWidgetState();
}

class _ViewBottomSheetWidgetState extends State<ViewBottomSheetWidget> {
  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          ListTile(
            leading: Icon(Icons.add),
            title: Text('ADD'),
            onTap: () {
              Navigator.of(context).pop();
            },
          ),
          ListTile(
            leading: Icon(Icons.remove),
            title: Text('REMOVE'),
            onTap: () {
              Navigator.of(context).pop();
            },
          )
        ],
      ),
    );
  }
}

//
// ===
//
// void main() {
//   runApp(ViewDialogApp());
// }
//
// class ViewDialogApp extends StatelessWidget {
//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       home: Scaffold(
//           appBar: AppBar(
//             title: Text('View Dialog App'),
//           ),
//           body: Column(
//             children: [
//               TextButton(
//                 child: Text('Basic Dialog'),
//                 onPressed: () {
//                   showDialog(
//                       context: context,
//                       barrierDismissible: false,
//                       builder: (BuildContext context) {
//                         return ViewDialogBasicWidget();
//                       });
//                 },
//               ),
//               TextButton(
//                 child: Text('Bottom Sheet'),
//                 onPressed: () {
//                   showModalBottomSheet(
//                       context: context,
//                       backgroundColor: Colors.yellow,
//                       builder: (context) {
//                         return ViewBottomSheetWidget();
//                       });
//                 },
//               )
//             ],
//           )),
//     );
//   }
// }
//
// class ViewDialogBasicWidget extends StatefulWidget {
//   @override
//   State<ViewDialogBasicWidget> createState() => _ViewDialogBasicWidgetState();
// }
//
// class _ViewDialogBasicWidgetState extends State<ViewDialogBasicWidget> {
//   @override
//   Widget build(BuildContext context) {
//     return AlertDialog(
//       title: Text('Dialog Title'),
//       content: Column(
//         mainAxisSize: MainAxisSize.min,
//         children: [
//           TextField(
//             decoration: InputDecoration(
//               border: OutlineInputBorder(),
//             ),
//           ),
//           Row(
//             children: [
//               Checkbox(value: true, onChanged: (value) {}),
//               Text('동의'),
//             ],
//           ),
//         ],
//       ),
//       actions: [
//         TextButton(
//           onPressed: () {
//             Navigator.of(context).pop();
//           },
//           child: Text("OK"),
//         ),
//       ],
//     );
//   }
// }
//
// class ViewBottomSheetWidget extends StatefulWidget {
//   @override
//   State<ViewBottomSheetWidget> createState() => _ViewBottomSheetWidgetState();
// }
//
// class _ViewBottomSheetWidgetState extends State<ViewBottomSheetWidget> {
//   @override
//   Widget build(BuildContext context) {
//     return SafeArea(
//       child: Column(
//         mainAxisSize: MainAxisSize.min,
//         children: [
//           ListTile(
//             leading: Icon(Icons.add),
//             title: Text('ADD'),
//             onTap: () {
//               Navigator.of(context).pop();
//             },
//           ),
//           ListTile(
//             leading: Icon(Icons.remove),
//             title: Text('REMOVE'),
//             onTap: () {
//               Navigator.of(context).pop();
//             },
//           )
//         ],
//       ),
//     );
//   }
// }
