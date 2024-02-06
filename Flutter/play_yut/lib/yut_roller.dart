import 'package:flutter/material.dart';
import 'dart:math';

final randomizer = Random();

class YutRoller extends StatefulWidget {
  const YutRoller({super.key});

  @override
  State<YutRoller> createState() {
    return _YutRollerState();
  }
}

class _YutRollerState extends State<YutRoller> {
  var currentYutRoll = 0;
  var totalYutRoll = 0;
  var yutList = [0, 0, 0, 0];

  void rollYut() {
    setState(() {
      for (var i = 0; i < 4; i++) {
        if (totalYutRoll < 4) {
          currentYutRoll = randomizer.nextInt(3);
          yutList[i] = currentYutRoll;
          totalYutRoll +=
              currentYutRoll == 2 ? currentYutRoll * 2 : currentYutRoll;
        } else {
          currentYutRoll = randomizer.nextInt(2);
          yutList[i] = currentYutRoll;
          totalYutRoll += currentYutRoll;
        }
      }
    });
  }

  @override
  Widget build(context) {
    return Column(
      mainAxisSize: MainAxisSize.min,
      crossAxisAlignment: CrossAxisAlignment.center,
      children: [
        Row(
          mainAxisSize: MainAxisSize.min,
          children: [
            Image.asset(
              'assets/yut/yut-${yutList[0]}.png',
              width: 60,
            ),
            Image.asset(
              'assets/yut/yut-${yutList[1]}.png',
              width: 60,
            ),
            Image.asset(
              'assets/yut/yut-${yutList[2]}.png',
              width: 60,
            ),
            Image.asset(
              'assets/yut/yut-${yutList[3]}.png',
              width: 60,
            ),
          ],
        ),
        const SizedBox(
          height: 50,
        ),
        ElevatedButton(
          onPressed: rollYut,
          style: ButtonStyle(
            backgroundColor: MaterialStateProperty.all(Color(0xffa04800)),
          ),
          child: const Text(
            "윷이요",
            style: const TextStyle(
              fontWeight: FontWeight.w600,
              color: Color(0xffffe0c1),
              fontSize: 30,
            ),
          ),
        )
      ],
    );
  }
}
