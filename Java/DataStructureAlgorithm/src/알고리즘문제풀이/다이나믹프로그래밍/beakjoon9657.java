package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;

public class beakjoon9657 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[Math.max(N+1, 5)];
        dp[1] = true;
        dp[2] = false;
        dp[3] = true;
        dp[4] = true;
        for(int i=5; i<=N; i++){
            dp[i] = !(dp[i-1] && dp[i-3] && dp[i-4]);
        }
        System.out.println(dp[N] ? "SK" : "CY");
    }
}
