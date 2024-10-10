package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon19947 {
    static long money;
    static int y;
    static long[] dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dp[y]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        money = Long.parseLong(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        dp = new long[y+1];
        dp[0] = money;
    }

    private static void execute(){
        for(int i=1; i<=y; i++){
            long y1 = (long)(dp[i-1]*1.05);
            dp[i] = Math.max(dp[i], y1);
            if(i>=3){
                long y3 = (long)(dp[i-3]*1.20);
                dp[i] = Math.max(dp[i], y3);
            }
            if(i>=5){
                long y5 = (long)(dp[i-5]*1.35);
                dp[i] = Math.max(dp[i], y5);
            }
        }
    }
}
