import 'package:flutter/material.dart';
import 'story_brain.dart';

StoryBrain storyBrain = StoryBrain();

void main() {
  runApp(const Destini());
}

class Destini extends StatelessWidget {
  const Destini({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Container(
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('images/background.png'),
            fit: BoxFit.cover,
          ),
        ),
        child: Scaffold(
          backgroundColor: Colors.transparent,
          body: SafeArea(
            child: Padding(
              padding: const EdgeInsets.all(10.0),
              child: Story(),
            ),
          ),
        ),
      ),
    );
  }
}

class Story extends StatefulWidget {
  const Story({super.key});

  @override
  State<Story> createState() => _StoryState();
}

class _StoryState extends State<Story> {
  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: [
        Expanded(
          flex: 5,
          child: Center(
            child: Text(
              storyBrain.getStory(),
              textAlign: TextAlign.center,
              style: TextStyle(fontSize: 25.0, color: Colors.white),
            ),
          ),
        ),
        Expanded(
          child: Padding(
            padding: EdgeInsets.all(15.0),
            child: InkWell(
              onTap: () {
                print('Yes is tapped');
                setState(() {
                  storyBrain.getChoice1();
                });
              },
              child: Container(
                color: Colors.red,
                child: Center(
                    child: Text(
                  'Yes',
                  style: TextStyle(fontSize: 25.0, color: Colors.white),
                )),
              ),
            ),
          ),
        ),
        Expanded(
          child: Padding(
            padding: EdgeInsets.all(15.0),
            child: GestureDetector(
              onTap: () {
                print('No is tapped');
                setState(() {
                  storyBrain.getChoice2();
                });
              },
              child: Visibility(
                visible: storyBrain.buttonShouldBeVisible(),
                child: Container(
                  color: Colors.blue,
                  child: Center(
                    child: Text(
                      'No',
                      style: TextStyle(fontSize: 25.0, color: Colors.white),
                    ),
                  ),
                ),
              ),
            ),
          ),
        ),
      ],
    );
  }
}
