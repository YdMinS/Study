import 'package:flutter/material.dart';

void main() {
  runApp(TextFieldApp());
}

class TextFieldApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            'Text Filed App',
          ),
        ),
        body: TextInput(),
      ),
    );
  }
}

class TextInput extends StatefulWidget {
  @override
  State<TextInput> createState() => _TextInputState();
}

class _TextInputState extends State<TextInput> {
  final controller = TextEditingController();
  int textCounter = 0;

  @override
  void initState() {
    super.initState();
    controller.addListener(_printValue);
  }

  void _printValue() {
    print('Current value: ${controller.text}');
    setState(() {
      textCounter = controller.text.length;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        TextField(
          style: TextStyle(fontSize: 15.0),
          controller: controller,
          decoration: InputDecoration(
            labelText: 'Label Text',
            prefixIcon: Icon(Icons.input),
            border: OutlineInputBorder(),
            hintText: 'Hint Text',
            helperText: 'Helper Text',
            counterText: '${textCounter} Counter Text',
            //errorText: 'Error Text',
          ),
          textInputAction: TextInputAction.search,
          keyboardType: TextInputType.url,
          obscureText: false,
          minLines: 2,
          maxLines: 4,
        ),
        ElevatedButton(
          child: Text('submit'),
          onPressed: () {
            print('submit : ${controller.text}');
          },
        )
      ],
    );
  }

  @override
  void dispose() {
    controller.dispose();
    super.dispose();
  }
}
