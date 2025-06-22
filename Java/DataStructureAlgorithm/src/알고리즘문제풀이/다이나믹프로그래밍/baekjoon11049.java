package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon11049 {
    static int N;
    static int[][] map;
    static long[] dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dp[N]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

    }

    private static void execute(){
        if(N==1){
            dp[1] = 0;
        }
    }
}
