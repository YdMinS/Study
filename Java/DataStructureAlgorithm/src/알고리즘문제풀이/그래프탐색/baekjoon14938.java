package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon14938 {
    static int N, boundary, M;
    static List<int[]>[] graph;
    static int[] items;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        boundary = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        items = new int[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            items[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            graph[a].add(new int[]{b, dist});
            graph[b].add(new int[]{a, dist});
        }
    }

    private static int execute(){
        int value = 0;
        for(int i=1; i<=N; i++){
            value = Math.max(value, dijkstra(i));
        }
        return value;
    }

    private static int dijkstra(int x){
        int[] distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[x] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[1], b[1]));
        pq.offer(new int[]{x, 0});
        int totalValue = 0;

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDist = current[1];

            if(currentDist>boundary) continue;

            for(int[] next : graph[currentNode]){
                int nextNode = next[0];
                int newDist = currentDist + next[1];

                if(newDist < distance[nextNode] && newDist<=boundary){
                    distance[nextNode] = newDist;
                    pq.offer(new int[]{nextNode, newDist});
                }
            }
        }
        for(int i = 1; i <= N; i++) {
            if(distance[i] <= boundary) {
                totalValue += items[i];
            }
        }
        return totalValue;
    }
}
