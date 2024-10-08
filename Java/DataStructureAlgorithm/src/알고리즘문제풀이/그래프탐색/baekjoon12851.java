package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon12851 {
    static int X, K, cnt=0, time;
    static final int MAX_K = 100000;
    static int[] dp = new int[MAX_K+1];


    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(time+"\n"+cnt);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    private static void execute(){
        Queue<Integer> q = new LinkedList();
        q.offer(X);
        dp[X]=1;
        while(!q.isEmpty()){
            int n = q.size();
            boolean isFound = false;
            for(int i=0; i<n; i++){
                int current = q.poll();

                if(current==K){
                    cnt++;
                    isFound = true;
                }

                int[] Next = {current-1, current+1, current*2};
                for(int next : Next){
                    if(next<0 || next>MAX_K) continue;
                    if(dp[next]==0 || dp[next] == dp[current]+1){
                        q.offer(next);
                        dp[next] = dp[current]+1;
                    }
                }
            }
            if(isFound) {
                time=dp[K]-1;
                break;
            }
        }
    }
}
