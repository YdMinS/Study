package 알고리즘문제풀이.빅오;

import java.lang.*;
import java.io.*;

public class baekjoon24264 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((long)Math.pow(N, 2)+"\n"+2);
    }
}