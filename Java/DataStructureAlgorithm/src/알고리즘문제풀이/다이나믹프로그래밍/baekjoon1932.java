package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1932 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, L;
    static int[][] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        dp = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = map[0][0];
    }

    static void execute() {
        for(int i=1; i<N; i++){
            for(int j=0; j<=i; j++){
                int a = 0;
                if(j-1>=0){
                    a = map[i][j] + dp[i-1][j-1];
                }
                int b = 0;
                if(j<=i-1) {
                    b = map[i][j] + dp[i-1][j];
                }
                dp[i][j] = Math.max(a, b);
            }
        }
    }

    static void output(){
        int max = -1;
        for(int i=0; i<N; i++){
            max = Math.max(dp[N-1][i], max);
        }
        System.out.println(max);
    }
}
