package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.util.*;
import java.lang.*;

public class baekjoon14002 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder strBuilder = new StringBuilder();
    static StringTokenizer st;
    static int N, max;
    static int[] map, dp;

    public static void main(String[] args) throws IOException {
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute() {
        for(int i=0; i<N; i++){
            dp[i] = 1;
            for(int j=0; j<i; j++){
                if(map[j] < map[i] && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
            if(dp[i]>max){
                max = dp[i];
            }
        }
    }

    static void output(){
        System.out.println(max);
        int index = max;
        for(int i=N-1; i>=0; i--){
            if(index == dp[i]){
                String str = map[i]+" "+strBuilder.toString();
                strBuilder.setLength(0);
                strBuilder.append(str);
                index--;
            }
        }
        System.out.println(strBuilder.toString());
    }
}
