package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon5972 {
    static int N, M;
    static List<Edge>[] graph;
    static int[] price;

    static class Edge{
        int to;
        int cowNum;

        public Edge(int to, int cowNum){
            this.to = to;
            this.cowNum = cowNum;
        }
    }

    static class Vertex implements Comparable<Vertex>{
        int node;
        int price;

        public Vertex(int node, int price){
            this.node = node;
            this.price = price;
        }

        @Override
        public int compareTo(Vertex o){
            return this.price-o.price;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(price[N]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        price = new int[N+1];
        Arrays.fill(price, Integer.MAX_VALUE);
        for(int i=0; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            graph[a].add(new Edge(b, price));
            graph[b].add(new Edge(a, price));
        }
    }

    private static void execute(){
        PriorityQueue<Vertex> pq = new PriorityQueue<>();
        pq.offer(new Vertex(1, 0));
        while(!pq.isEmpty()){
            Vertex currentNode = pq.poll();
            if(currentNode.price > price[currentNode.node]) continue;

            if(currentNode.node == N) break;

            for(Edge edge : graph[currentNode.node]){
                int newPrice = currentNode.price + edge.cowNum;
                if(newPrice < price[edge.to]){
                    price[edge.to] = newPrice;
                    pq.offer(new Vertex(edge.to, newPrice));
                }
            }
        }
    }
}
