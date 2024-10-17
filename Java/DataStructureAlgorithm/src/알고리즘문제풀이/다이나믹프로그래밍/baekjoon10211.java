package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon10211 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int map[], dp[];

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            input();
            execute();
        }
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        n = Integer.parseInt(br.readLine());
        map = new int[n];
        dp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void execute() throws IOException{
        dp[0] = map[0];
        int max = dp[0];
        for(int i=1; i<n; i++){
            dp[i] = Math.max(map[i], dp[i-1]+map[i]);
            max = Math.max(max, dp[i]);
        }
        bw.write(max+"\n");
    }
}
