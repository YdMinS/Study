package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon11055 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, max=-1;
    static int[] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(max);
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i=0; i< input.length; i++){
            map[i] = Integer.parseInt(input[i]);
        }
    }

    static void execute() {
        for(int i=0; i<N; i++){
            dp[i] = map[i];
            for(int j=0; j<i; j++){
                if(map[j]<map[i]){
                    dp[i] = Math.max(dp[i], dp[j]+map[i]);
                }
            }
            max = Math.max(dp[i], max);
        }
    }
}
