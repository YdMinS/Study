package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon19698 {
    public static void main(String[] argr) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int max = Math.min((W/L) * (H/L), N);
        System.out.print(max);
    }
}
