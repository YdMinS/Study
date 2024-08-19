package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.lang.*;
import java.util.*;

public class baekjoon11722 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, cnt = 1;
    static int[] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
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

    static void execute(){
        dp[0] = 1;
        for(int i=1; i<N; i++){
            dp[i] = 1;
            for(int j=i-1; j>=0; j--){
                if(map[i]<map[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            cnt = Math.max(dp[i], cnt);
        }
    }
}
