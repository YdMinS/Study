package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon15624 {
    static int N;
    static final int REF = 1000000007;
    static long[] dp;

    public static void main(String[] args) throws IOException{
        input();
        if(N>1) {
            execute();
        }
        System.out.println(dp[N]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new long[N+1<2 ? 2 : N+1];
        dp[0] = 0;
        dp[1] = 1;
    }

    private static void execute(){
        for(int i=2; i<=N; i++){
            dp[i] = (dp[i-1]+dp[i-2])%REF;
        }
    }
}
