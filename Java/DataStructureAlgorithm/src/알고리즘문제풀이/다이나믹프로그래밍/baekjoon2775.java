package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon2775 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T;
    static int[][] kn, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        T = Integer.parseInt(br.readLine());
        kn = new int[T][2];
        dp = new int[15][15];
        for(int i=0; i<T; i++){
            kn[i][0] = Integer.parseInt(br.readLine());
            kn[i][1] = Integer.parseInt(br.readLine());
        }
        for(int i=1; i<=14; i++){
            dp[0][i] = i;
            dp[i][1] = dp[i-1][1];
        }
        for(int i=1; i<=14; i++){
            for(int j=2; j<=14; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
    }

    private static void execute(){
        for(int i=0; i<T; i++){
            int k = kn[i][0];
            int n = kn[i][1];
            System.out.println(dp[k][n]);
        }
    }
}
