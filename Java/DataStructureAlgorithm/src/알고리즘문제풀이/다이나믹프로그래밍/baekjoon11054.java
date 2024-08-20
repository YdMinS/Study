package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon11054 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max=1;
    static int[] map;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[N][3];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute() {
        for(int i=0; i<N; i++){
            // INCREASING
            dp[i][0] = 1;
            for(int j=i-1; j>=0; j--){
                if(map[i] > map[j]){
                    dp[i][0] = Math.max(dp[j][0] + 1, dp[i][0]);
                }
            }
            dp[i][2] += dp[i][0];
            // DECREASING
            dp[N-1-i][1] = 1;
            for(int j=N-1-i; j<N; j++){
                if(map[N-1-i] > map[j]){
                    dp[N-1-i][1] = Math.max(dp[j][1] + 1, dp[N-1-i][1]);
                }
            }
            dp[N-1-i][2] += dp[N-1-i][1];
        }
    }

    static void output(){
        for(int i=0; i<N; i++){
            max  = Math.max(max, dp[i][2]);
        }
        System.out.println(max-1);
    }
}
