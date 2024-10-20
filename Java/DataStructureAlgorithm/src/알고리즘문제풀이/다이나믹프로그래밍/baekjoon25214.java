package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon25214 {
    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException{
        input();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int maxDiff = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            maxDiff = Math.max(maxDiff, num-min);
            dp[i] = maxDiff;
        }
        br.close();
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            bw.append(dp[i]+"");
            if(i<N-1){
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
