package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1916 {
    static int N, M, from, to;
    static List<Line>[] graph;
    static int[] price;

    static class Line{
        int to;
        int price;

        Line(int to, int price){
            this.to = to;
            this.price = price;
        }
    }

    static class Node implements Comparable<Node>{
        int vertex;
        int minPrice;

        Node(int vertex, int minPrice){
            this.vertex = vertex;
            this.minPrice = minPrice;
        }

        @Override
        public int compareTo(Node other) {
            return this.minPrice - other.minPrice;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(price[to]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new ArrayList[N+1];
        price = new int[N+1];
        Arrays.fill(price, Integer.MAX_VALUE);
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            graph[from].add(new Line(to, price));
        }
        st = new StringTokenizer(br.readLine());
        from = Integer.parseInt(st.nextToken());
        to = Integer.parseInt(st.nextToken());
    }

    private static void execute() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(from, 0));
        price[from] = 0;

        while(!pq.isEmpty()){
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;
            if(currentNode.minPrice> price[currentVertex]) continue;

            if(currentVertex == to) break;

            for(Line line : graph[currentVertex]){
                int newPrice = price[currentVertex] + line.price;
                if(newPrice < price[line.to]){
                    price[line.to] = newPrice;
                    pq.offer(new Node(line.to, newPrice));
                }
            }
        }
    }
}
