package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon17356 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double M = (B - A) / 400;
        System.out.println(1 / (1+Math.pow(10, M)));
    }
}
