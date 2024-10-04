package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon11779 {
    static int N, M, from, to;
    static List<Edge>[] graph;
    static int[] price;
    static int[] map;

    static class Edge{
        int to;
        int weight;

        public Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node>{
        int vertex;
        int price;

        public Node(int vertex, int price){
            this.vertex = vertex;
            this.price = price;
        }

        @Override
        public int compareTo(Node other){
            return this.price - other.price;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new ArrayList[N+1];
        price = new int[N+1];
        map = new int[N+1];
        Arrays.fill(price, Integer.MAX_VALUE);
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            graph[from].add(new Edge(to, price));
        }
        st = new StringTokenizer(br.readLine());
        from = Integer.parseInt(st.nextToken());
        to = Integer.parseInt(st.nextToken());
    }

    private static void execute(){
        PriorityQueue<Node> pq = new PriorityQueue();
        pq.offer(new Node(from, 0));
        price[from] = 0;

        while(!pq.isEmpty()){
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;
            if(currentNode.price > price[currentVertex]) continue;

            if(currentVertex==to) break;

            for(Edge edge : graph[currentVertex]){
                int newPrice = edge.weight + price[currentVertex];
                if(newPrice < price[edge.to]){
                    price[edge.to] = newPrice;
                    pq.offer(new Node(edge.to, newPrice));
                    map[edge.to] = currentVertex;
                }
            }
        }
    }

    private static void output() throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int cnt = 1;
        int current = to;
        while(current!=from){
            cnt++;
            stack.add(current);
            current = map[current];
        }
        stack.add(from);
        System.out.println(price[to]);
        System.out.println(cnt);
        int n = stack.size();
        for(int i=0; i<n; i++){
            int node = stack.pop();
            stringBuilder.append(node+"");
            if(!stack.isEmpty()){
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}
