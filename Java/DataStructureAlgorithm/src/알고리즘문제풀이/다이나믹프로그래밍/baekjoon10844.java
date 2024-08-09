package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.lang.*;

public class baekjoon10844 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        input();
        findDp();
        findResult();
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        dp = new long[N+1][10];
        for(int i=1; i<=9; i++){
            dp[1][i]=1;
        }
    }

    static void findDp(){
        long ref = 1000000000;
        for(int i=2; i<=N; i++){
            for(int j=0; j<=9; j++){
                if(j>0){
                    dp[i][j] = (dp[i][j] + dp[i-1][j-1])%ref;
                }
                if(j<9){
                    dp[i][j] = (dp[i][j] + dp[i-1][j+1])%ref;
                }
            }
        }
    }

    static void findResult(){
        long result = 0;
        long ref = 1000000000;
        for(int i=0; i<=9; i++){
            result = (result + dp[N][i])%ref;
        }
        System.out.println(result);
    }
}
