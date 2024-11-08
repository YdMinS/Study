package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon18126 {
    static int N;
    static List<Edge>[] graph;
    static long maxDistance = 0;

    static class Edge{
        int to;
        long dist;

        public Edge(int to, long dist){
            this.to = to;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        dfs(1, -1, 0);
        System.out.println(maxDistance);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList();
        }
        for(int i=1; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            graph[a].add(new Edge(b, c));
            graph[b].add(new Edge(a, c));
        }
        br.close();
    }

    private static void dfs(int node, int parent, long distance){
        maxDistance = Math.max(maxDistance, distance);

        for(Edge edge : graph[node]){
            if(edge.to != parent){
                dfs(edge.to, node, distance+edge.dist);
            }
        }
    }
}
