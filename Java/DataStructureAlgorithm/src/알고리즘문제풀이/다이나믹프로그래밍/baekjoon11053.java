package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.lang.*;
import java.util.*;

public class baekjoon11053 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, max=0;
    static int[] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(max);
    }

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute(){
        for(int i=0; i<N; i++){
            dp[i] = 1;
            for(int j=0; j<i; j++){
                if(map[j] < map[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(dp[i]>max){
                max = dp[i];
            }
        }
    }
}
