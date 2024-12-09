package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon12852 {
        static int N, min = Integer.MAX_VALUE;
        static int[] dp, prev;

    public static void main(String[] args) throws IOException{
        input();
        search();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        prev = new int[N+1];
    }

    private static void search(){
        for(int i=2; i<=N; i++){
            dp[i] = dp[i-1] +1;
            prev[i] = i-1;

            if(i%2 ==0 && dp[i]>dp[i/2]+1){
                dp[i] = dp[i/2]+1;
                prev[i] = i/2;
            }

            if(i%3 == 0 && dp[i]>dp[i/3]+1){
                dp[i] = dp[i/3]+1;
                prev[i] = i/3;
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(dp[N]+"\n");
        List<Integer> path = new ArrayList<>();
        for(int i=N; i != 0; i=prev[i]){
            path.add(i);
        }
        for(int i=0; i<path.size(); i++){
            bw.write(path.get(i) + (i<path.size()-1 ? " ": ""));
        }
        bw.flush();
        bw.close();
    }
}

