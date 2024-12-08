package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;

public class baekjoon1003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[41][2];
        dp[0][0] = 1;
        dp[1][1] = 1;
        for(int i=2; i<=40; i++){
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            bw.append(String.format("%d %d\n", dp[n][0], dp[n][1]));
        }
        bw.flush();
        bw.close();
    }
}
