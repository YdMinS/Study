import 'package:flutter/material.dart';

import 'package:course_project_01/styled_text.dart';
import 'package:course_project_01/dice_roller.dart';

var startAlignment = Alignment.topLeft;
var endAlignment = Alignment.bottomRight;

class GradientContainer extends StatelessWidget{
  GradientContainer(this.color1, this.color2, {super.key});

  GradientContainer.icecream({super.key}) 
    : color1 = Colors.pink,
      color2 = Colors.lightBlue;

  final Color color1;
  final Color color2;

  @override
  Widget build(context) {
    startAlignment = Alignment.topLeft;
    return Container(
          decoration: BoxDecoration(
            gradient: LinearGradient(
              colors: [color1, color2],
              begin: startAlignment,
              end: endAlignment,
            ),
          ),
          child: Center(
            child: DiceRoller(),
          ),
        );
  }
}

// class GradientContainer extends StatelessWidget{
//   const GradientContainer({super.key, required this.colors});

//   final List<Color> colors;
 
//   @override
//   Widget build(context) {
//     startAlignment = Alignment.center;
//     return Container(
//           decoration: BoxDecoration(
//             gradient: LinearGradient(
//               colors: colors,
//               begin: startAlignment,
//               end: endAlignment,
//             ),
//           ),
//           child: const Center(
//             child: StyledText("TEXT")
//           ),
//         );
//   }
// }