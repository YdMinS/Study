package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.lang.*;

public class baekjoon1309 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, ref = 9901;
    static long[][] dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        dp = new long[3][N+1];
        dp[0][1] = 1;
        dp[1][1] = 1;
        dp[2][1] = 1;
    }

    static void execute(){
        for(int i=2; i<=N; i++){
            dp[0][i] = (dp[1][i-1] + dp[2][i-1])%ref;
            dp[1][i] = (dp[0][i-1] + dp[2][i-1])%ref;
            dp[2][i] = ((dp[0][i-1] + dp[1][i-1])%ref + dp[2][i-1])%ref;
        }
    }

    static void output(){
        long result = ((dp[0][N] + dp[1][N])%ref + dp[2][N])%ref;
        System.out.println(result);
    }
}
