package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon2133 {
    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException{
        input();
        if(N%2==1){
            System.out.println(0);
            return;
        }
        calculateDp();
        System.out.println(dp[N]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
    }

    private static void calculateDp(){
        dp[0] = 1;
        if(N>1) dp[2] = 3;
        for(int i=4; i<=N; i+=2){
            dp[i] = dp[i-2] * 3;
            for(int j=i-4; j>=0; j-=2){
                dp[i] += dp[j] * 2;
            }
        }
    }
}
