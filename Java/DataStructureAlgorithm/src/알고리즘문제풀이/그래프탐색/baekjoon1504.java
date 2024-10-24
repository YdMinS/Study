package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon1504 {
    static int N, M, from, to;
    static List<Edge>[] graph;

    static class Edge{
        int to;
        int distance;

        public Edge(int to, int distance){
            this.to = to;
            this.distance = distance;
        }
    }

    static class Vertex implements Comparable<Vertex>{
        int node;
        int minDist;

        public Vertex(int node, int minDist){
            this.node = node;
            this.minDist = minDist;
        }

        @Override
        public int compareTo(Vertex other){
            return this.minDist-other.minDist;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            graph[a].add(new Edge(b, dist));
            graph[b].add(new Edge(a, dist));
        }
        st = new StringTokenizer(br.readLine());
        from = Integer.parseInt(st.nextToken());
        to = Integer.parseInt(st.nextToken());
        br.close();
    }

    private static void execute(){
        int[] distFrom1 = dijkstra(1);
        int[] distFromV1 = dijkstra(from);
        int[] distFromV2 = dijkstra(to);

        long path1 = (long)distFrom1[from] + distFromV1[to] + distFromV2[N];
        long path2 = (long)distFrom1[to] + distFromV2[from] + distFromV1[N];

        long result = Math.min(path1, path2);

        if (distFrom1[from] == Integer.MAX_VALUE || distFrom1[to] == Integer.MAX_VALUE ||
                distFromV1[to] == Integer.MAX_VALUE || distFromV2[N] == Integer.MAX_VALUE ||
                distFromV1[N] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    private static int[] dijkstra(int start){
        int[] distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<Vertex> pq = new PriorityQueue<>();
        pq.offer(new Vertex(start, 0));

        while(!pq.isEmpty()){
            Vertex current = pq.poll();

            if(current.minDist > distance[current.node]) continue;

            for(Edge edge : graph[current.node]){
                int newDist = current.minDist + edge.distance;
                if(newDist < distance[edge.to]){
                    distance[edge.to] = newDist;
                    pq.offer(new Vertex(edge.to, newDist));
                }
            }
        }
        return distance;
    }
}
