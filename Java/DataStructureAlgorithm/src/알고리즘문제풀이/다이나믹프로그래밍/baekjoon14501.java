package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.util.*;
import java.lang.*;

public class baekjoon14501 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max=0;
    static int[] t, p, dp;

    public static void main(String[] args) throws IOException{
        input();
        calculate();
        System.out.println(max);
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        dp = new int[N+2];
        t = new int[N+1];
        p = new int[N+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void calculate(){
        for(int i=1; i<=N; i++){
            dp[i+1] = Math.max(dp[i+1], dp[i]);
            if(i+t[i] <= N+1){
                dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i]+p[i]);
            }
        }
        for(int i=1; i<=N+1; i++){
            max = Math.max(dp[i], max);
        }
    }
}
