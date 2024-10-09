package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon14606 {
    static int[] dp;

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if(N==1) {
            System.out.println(0);
            return;
        }
        dp = new int[N+1];
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3; i<=N; i++){
            int mid = (i-1)%2==0 ? (i-1)/2 : (i-1)/2+1;
            for(int j=1; j<=mid; j++){
                dp[i] = Math.max(dp[i], dp[j]+dp[i-j]+j*(i-j));
            }
        }
        System.out.println(dp[N]);
    }
}
