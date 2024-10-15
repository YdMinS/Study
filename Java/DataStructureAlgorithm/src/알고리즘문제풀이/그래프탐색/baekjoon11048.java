package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon11048 {
    static int N, M;
    static int[][] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dp[N][M]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];
        dp = new int[N+1][M+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void execute(){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(i-1>0){
                    if(j-1>0) {
                        dp[i][j] = Math.max(map[i][j]+dp[i-1][j-1], dp[i][j]);
                        dp[i][j] = Math.max(map[i][j]+dp[i][j-1], dp[i][j]);
                    }
                    dp[i][j] = Math.max(map[i][j] + dp[i-1][j], dp[i][j]);
                } else if(j-1>0){
                    dp[i][j] = Math.max(map[i][j]+dp[i][j-1], dp[i][j]);
                } else {
                    dp[i][j] = map[i][j];
                }

            }
        }
    }
}
