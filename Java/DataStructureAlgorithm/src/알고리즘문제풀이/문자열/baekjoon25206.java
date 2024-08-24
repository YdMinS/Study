package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon25206 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static double N=0, total=0, avg;
    static Map<String, Double> ref = new HashMap<>();
    static {
        ref.put("A+", 4.5);
        ref.put("A0", 4.0);
        ref.put("B+", 3.5);
        ref.put("B0", 3.0);
        ref.put("C+", 2.5);
        ref.put("C0", 2.0);
        ref.put("D+", 1.5);
        ref.put("D0", 1.0);
        ref.put("F", 0.0);
    }


    public static void main(String[] args) throws IOException{
        input();
        System.out.println(String.format("%.6f", total/N));
    }

    static void input() throws IOException{
        for(int i=0; i<20; i++){
            String[] strList = br.readLine().split(" ");
            double points = Double.parseDouble(strList[1]);
            String level = strList[2];
            if(level.equals("P")) continue;
            N += points;
            total += points * ref.get(level);
        }
    }
}
