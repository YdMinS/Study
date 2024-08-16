package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.lang.*;

public class baekjoon2156 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] map;
    static int[][] dp;

    public static void main(String[] str) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[3][N];
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
        dp[0][0] = 0;
        dp[1][0] = map[0];
        dp[2][0] = 0;
    }

    static void execute() {
        for(int i=1; i<N; i++){
            dp[0][i] = Math.max(Math.max(dp[0][i-1], dp[1][i-1]), dp[2][i-1]);
            dp[1][i] = dp[0][i-1] + map[i];
            dp[2][i] = dp[1][i-1] + map[i];
        }
    }

    static void output(){
        System.out.println(Math.max(Math.max(dp[0][N-1], dp[1][N-1]), dp[2][N-1]));
    }
}
