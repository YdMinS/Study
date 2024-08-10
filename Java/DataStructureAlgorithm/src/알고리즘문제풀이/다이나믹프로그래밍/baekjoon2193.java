package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon2193 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long[][] dp;

    public static void main(String[] arts) throws IOException{
        input();
        findDp();
        System.out.println(dp[N][0] + dp[N][1]);
    }

    public static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        dp = new long[N+1][2];
        dp[1][1] = 1;
    }

    public static void findDp(){
        for(int i=2; i<=N; i++){
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }
    }
}
