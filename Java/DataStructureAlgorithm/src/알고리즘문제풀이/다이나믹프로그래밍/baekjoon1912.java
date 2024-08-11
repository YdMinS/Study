package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.util.*;
import java.lang.*;

public class baekjoon1912 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max=Integer.MIN_VALUE;
    static int[] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(max);
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute(){
        dp[0] = map[0];
        max = dp[0];
        for(int i=1; i<N; i++){
            dp[i] = Math.max(dp[i-1]+map[i], map[i]);
            max = Math.max(max, dp[i]);
        }
    }
}
