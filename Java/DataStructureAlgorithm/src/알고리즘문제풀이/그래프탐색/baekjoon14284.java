package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon14284 {
    static int N, M, s, t;
    static List<Edge>[] graph;
    static int[] dist;

    static class Edge{
        int to;
        int weight;

        public Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    static class Vertex implements Comparable<Vertex>{
        int node;
        int minWeight;

        public Vertex(int node, int minWeight){
            this.node = node;
            this.minWeight = minWeight;
        }

        @Override
        public int compareTo(Vertex other){
            return this.minWeight - other.minWeight;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(dist[t]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            graph[a].add(new Edge(b, weight));
            graph[b].add(new Edge(a, weight));
        }
        st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
    }

    private static void execute() {
        PriorityQueue<Vertex> pq = new PriorityQueue();
        pq.offer(new Vertex(s, 0));
        while(!pq.isEmpty()){
            Vertex currentNode = pq.poll();
            if(currentNode.minWeight > dist[currentNode.node]) continue;
            if(currentNode.node == t) break;
            for(Edge edge : graph[currentNode.node]){
                int nextNode = edge.to;
                int newWeight = currentNode.minWeight + edge.weight;
                if(newWeight<dist[nextNode]){
                    dist[nextNode] = newWeight;
                    pq.offer(new Vertex(nextNode, newWeight));
                }
            }
        }
    }
}
