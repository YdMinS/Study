package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon27110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int sum = Math.min(N, A) + Math.min(N, B)+ Math.min(N, C);
        System.out.print(sum);
    }
}
