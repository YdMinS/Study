package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon11051 {
    static final int MOD = 10007;
    static int N, K;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];
    }

    private static void execute() {
        for(int i=0; i<=N; i++){
            for(int j=0; j<=Math.min(i, K); j++){
                if(j==0 || j==i){
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%MOD;
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}
