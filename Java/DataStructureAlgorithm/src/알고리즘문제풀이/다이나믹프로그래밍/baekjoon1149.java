package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon1149 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] priceMap;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        input();
        findMinPrice();
        printMin();
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        dp = new int[3][N+1];
        priceMap = new int[3][N+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            priceMap[0][i] = Integer.parseInt(st.nextToken());
            priceMap[1][i] = Integer.parseInt(st.nextToken());
            priceMap[2][i] = Integer.parseInt(st.nextToken());
        }
        dp[0][1] = priceMap[0][1];
        dp[1][1] = priceMap[1][1];
        dp[2][1] = priceMap[2][1];
    }

    static void findMinPrice() {
        for(int i=2; i<=N; i++){
            for(int j=0; j<3; j++){
                int index1 = (j+1)%3;
                int index2 = (j+2)%3;
                dp[j][i] = Math.min(dp[index1][i-1] + priceMap[j][i], dp[index2][i-1] + priceMap[j][i]);
            }
        }
    }

    static void printMin(){
        System.out.println(Math.min(Math.min(dp[0][N], dp[1][N]),dp[2][N]));
    }
}
