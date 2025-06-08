package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2985 {
    private static char[] OPERATOR = new char[]{'+', '-', '*', '/'};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        System.out.println(findEquation(a, b, c));
    }

    private static String findEquation(int a, int b, int c){
        for(char operator : OPERATOR){
            switch (operator){
                case '+':
                    if (a+b == c) return ""+a+operator+b+"="+c;
                    if (a == b+c) return ""+a+"="+b+operator+c;
                    break;
                case '-':
                    if (a-b == c) return ""+a+operator+b+"="+c;
                    if (a == b-c) return ""+a+"="+b+operator+c;
                    break;
                case '*':
                    if (a*b == c) return ""+a+operator+b+"="+c;
                    if (a == b*c) return ""+a+"="+b+operator+c;
                    break;
                case '/':
                    if (a/b == c) return ""+a+operator+b+"="+c;
                    if (a == b/c) return ""+a+"="+b+operator+c;
                    break;
            }
        }
        return "NONE";
    }
}
