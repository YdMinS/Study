package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon14652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int y = K % M;
        int x = K / M;
        System.out.printf("%d %d", x, y);
    }
}
