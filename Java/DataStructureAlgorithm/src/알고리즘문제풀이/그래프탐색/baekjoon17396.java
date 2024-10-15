package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon17396 {
    static int N, M;
    static List<Edge>[] graph;
    static boolean[] visitable;
    static long[] time;

    static class Edge{
        int to;
        long time;

        public Edge(int to, long time){
            this.to = to;
            this.time = time;
        }
    }

    static class Vertex implements Comparable<Vertex>{
        int node;
        long minTime;

        public Vertex(int node, long minTime){
            this.node = node;
            this.minTime = minTime;
        }

        @Override
        public int compareTo(Vertex other){
            return Long.compare(this.minTime,other.minTime);
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(time[N-1]==Long.MAX_VALUE ? -1 : time[N-1]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visitable = new boolean[N];
        time = new long[N];
        Arrays.fill(time, Long.MAX_VALUE);
        graph = new ArrayList[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            graph[i] = new ArrayList();
            visitable[i] = Integer.parseInt(st.nextToken())==0;
        }
        visitable[N-1] = true;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            graph[a].add(new Edge(b, weight));
            graph[b].add(new Edge(a, weight));
        }
    }

    private static void execute(){
        PriorityQueue<Vertex> pq = new PriorityQueue<>();
        pq.offer(new Vertex(0, 0));
        time[0] = 0;
        while(!pq.isEmpty()){
            Vertex currentNode = pq.poll();
            int node = currentNode.node;
            if(currentNode.minTime > time[node]) continue;
            for(Edge edge : graph[currentNode.node]){
                if(visitable[edge.to]){
                    long newTime = currentNode.minTime + edge.time;
                    if (newTime < time[edge.to]){
                        time[edge.to] = newTime;
                        pq.offer(new Vertex(edge.to, newTime));
                    }
                }
            }
        }
    }
}
