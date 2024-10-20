package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon15489 {
    static int R, C, W;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        dp = new int[30][30];
        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;
        for(int i=2; i<30; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
    }

    private static int execute() {
        int result=0;
        for(int i=0; i<W; i++){
            for(int j=0; j<=i; j++){
                result+= dp[R-1+i][C-1+j];
            }
        }
        return result;
    }
}
