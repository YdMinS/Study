package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1446 {
    static class Edge{
        int from;
        int to;
        int length;

        public Edge(int from, int to, int length){
            this.from = from;
            this.to = to;
            this.length = length;
        }
    }

    static int N, Destination;
    static int[] dp;
    static List<Edge> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dp[Destination]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        Destination = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            if(to <= Destination) {
                graph.add(new Edge(from, to, length));
            }
        }
    }

    private static void execute() {
        dp = new int[Destination+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0; i<=Destination; i++){
            if(i>0){
                dp[i] = Math.min(dp[i], dp[i-1]+1);
            }
            for(Edge edge : graph){
                if(edge.from == i){
                    dp[edge.to] = Math.min(dp[edge.to], dp[i]+edge.length);
                }
            }
        }
    }
}
