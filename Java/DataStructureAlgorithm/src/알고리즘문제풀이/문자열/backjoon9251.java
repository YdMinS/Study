package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;

public class backjoon9251 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] str = new String[2];
    static int[][] dp;
    static int N, M;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dp[N][M]);
    }

    private static void input() throws IOException{
        str[0] = br.readLine();
        str[1] = br.readLine();
        N = str[0].length();
        M = str[1].length();
        dp = new int[N+1][M+1];
    }

    private static void execute(){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(str[0].charAt(i-1) == str[1].charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
    }
}
