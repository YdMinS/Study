package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon14495 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }

    private static long fibonacci(int n){
        long[] dp = new long[n+1];
        if(n<=3){
            return 1;
        }
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for(int i=4; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-3];
        }
        return dp[n];
    }
}
