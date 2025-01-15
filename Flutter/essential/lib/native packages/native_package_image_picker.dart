import 'package:flutter/material.dart';
import 'package:image_picker/image_picker.dart';
import 'dart:io';

void main() => runApp(new NativePackageImagePickerApp());

class NativePackageImagePickerApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: WidgetA(),
    );
  }
}

class WidgetA extends StatefulWidget {
  @override
  State<WidgetA> createState() => _WidgetAState();
}

class _WidgetAState extends State<WidgetA> {
  XFile? _image;

  Future getGalleryImage() async {
    var image = await ImagePicker().pickImage(source: ImageSource.gallery);
    setState(() {
      _image = image;
    });
  }

  Future getCameraImage() async {
    var image = await ImagePicker().pickImage(source: ImageSource.camera);
    setState(() {
      _image = image;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Native Package Image Picker'),
      ),
      body: Container(
        color: Colors.blueAccent,
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              ElevatedButton(
                child: Text('Upload Image'),
                onPressed: () {
                  getGalleryImage();
                },
              ),
              Center(
                child: _image == null
                    ? Text(
                        'No image selected',
                        style: TextStyle(
                          color: Colors.white,
                        ),
                      )
                    : CircleAvatar(
                        backgroundImage: FileImage(File(_image!.path)),
                        radius: 100,
                      ),
              ),
              ElevatedButton(
                  child: Text('Camera'),
                  onPressed: () {
                    getCameraImage();
                  })
            ],
          ),
        ),
      ),
    );
  }
}
