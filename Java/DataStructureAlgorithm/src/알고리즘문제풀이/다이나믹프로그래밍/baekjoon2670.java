package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon2670 {
    static int N;
    static double max = 0;
    static double[] dp;

    public static void main(String[] args) throws IOException{
        input();
        System.out.printf("%.3f",max);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new double[N];
        for(int i=1; i<N; i++){
            double current = Double.parseDouble(br.readLine());
            dp[i] = Math.max(current, current*dp[i-1]);
            max = Math.max(dp[i], max);
        }
    }
}
