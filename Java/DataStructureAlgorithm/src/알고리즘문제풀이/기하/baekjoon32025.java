package 알고리즘문제풀이.기하;

import java.lang.*;
import java.io.*;

public class baekjoon32025 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int W = Integer.parseInt(br.readLine())*100;
        int H = Integer.parseInt(br.readLine())*100;
        long HalbRadius = Math.min(W, H)/2;
        System.out.println(HalbRadius);
    }
}
