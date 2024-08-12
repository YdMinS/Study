package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon2225 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K;
    static long[][] dp;

    public static void main(String[] args) throws IOException{
        input();
        long result = calculate();
        System.out.println(result);
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new long[K+1][N+1];
        for(int i=1; i<=K; i++){
            dp[i][0] = 1;
        }
    }

    static long calculate(){
        long ref = 1000000000;
        for(int i=1; i<=K; i++){
            for(int j=1; j<=N; j++){
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%ref;
            }
        }
        return dp[K][N];
    }
}
