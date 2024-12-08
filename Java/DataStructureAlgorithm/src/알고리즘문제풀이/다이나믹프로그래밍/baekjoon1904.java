package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;

public class baekjoon1904 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int REF = 15746;
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=N; i++){
                dp[i] = (dp[i-1] + dp[i-2])%REF;
        }
        System.out.println(dp[N]);
    }
}
