package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1753 {
    static int N, M, startNode;
    static int[] distance;
    static List<Edge>[] map;

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node>{
        int vertex;
        int dist;

        Node(int vertex, int dist){
            this.vertex = vertex;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other){
            return this.dist - other.dist;
        }

    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        map = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            map[i] = new ArrayList<>();
        }
        startNode = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            map[from].add(new Edge(to, weight));
        }
    }

    private static void execute() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(startNode, 0));
        distance[startNode] = 0;

        while(!pq.isEmpty()){
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;
            if(currentNode.dist > distance[currentVertex]) continue;

            for(Edge edge : map[currentVertex]){
                int newDist = distance[currentVertex] + edge.weight;
                if(newDist < distance[edge.to]){
                    distance[edge.to] = newDist;
                    pq.offer(new Node(edge.to, newDist));
                }
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<distance.length; i++){
            if(distance[i]==Integer.MAX_VALUE){
                bw.append("INF\n");
            } else {
                bw.append(distance[i]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
