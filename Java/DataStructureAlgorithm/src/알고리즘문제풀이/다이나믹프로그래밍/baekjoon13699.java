package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon13699 {
    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dp[N]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new long[N+1];
        dp[0] = 1;
    }

    private static void execute() {
        for(int i=1; i<=N; i++){
            long sum = 0;
            for(int j=0; j<=i-1; j++){
                sum += dp[j]*dp[i-1-j];
            }
            dp[i] = sum;
        }
    }
}
