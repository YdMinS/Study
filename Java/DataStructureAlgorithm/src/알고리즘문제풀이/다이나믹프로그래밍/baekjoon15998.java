package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.lang.*;

public class baekjoon15998 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, calculatedIndex;
    static int[] map, dp;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        calculatedIndex = 3;
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
    }

    static void execute() throws IOException{
        int ref = 1000000009;
        for(int i: map){
            if(calculatedIndex<i) {
                for (int j = (calculatedIndex + 1); j <= i; j++) {
                    dp[j] = ((dp[j - 3] + dp[j - 2]) % ref + dp[j - 1] % ref) % ref;
                    calculatedIndex = j;
                }
            }
            bw.write(dp[i]+"\n");
        }
    }

    static void output() throws IOException{
        bw.flush();
        bw.close();
    }
}
