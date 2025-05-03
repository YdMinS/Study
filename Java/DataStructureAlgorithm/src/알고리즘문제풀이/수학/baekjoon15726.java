package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon15726 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long result1 = A * B / C;
        long result2 = A * C / B;
        System.out.print(Math.max(result1, result2));
    }
}
