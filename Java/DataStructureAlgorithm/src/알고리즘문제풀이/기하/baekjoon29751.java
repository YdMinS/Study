package 알고리즘문제풀이.기하;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon29751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double W = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());
        System.out.println(String.format("%.1f", W*H/2));
    }
}
