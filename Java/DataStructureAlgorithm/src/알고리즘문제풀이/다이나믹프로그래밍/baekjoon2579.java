package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon2579 {
    static int N;
    static int[] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dp[N-1]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[N];
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void execute() {
        if(N<=2){
            if(N==1){
                dp[0] = map[0];
            } else {
                dp[1] = map[0] + map[1];
            }
            return;
        }
        dp[0] = map[0];
        dp[1] = map[0] + map[1];
        dp[2] = Math.max(map[0], map[1]) + map[2];
        for(int i=3; i<N; i++){
            dp[i] = Math.max(dp[i-2], dp[i-3]+map[i-1]) + map[i];
        }
    }
}
