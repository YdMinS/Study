package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon10282 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M, startNode;
    static List<int[]>[] graph;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            input();
            output(dijkstra());
        }
    }

    private static void input() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            graph[b].add(new int[]{a, time});
        }
    }

    private static int[] dijkstra(){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1]-b[1]);
        int[] time = new int[N+1];
        Arrays.fill(time, Integer.MAX_VALUE);
        time[startNode] = 0;
        pq.offer(new int[]{startNode, time[startNode]});
        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int currentNode = current[0];
            int infectedTime = current[1];

            if(time[currentNode] < infectedTime) continue;

            for(int[] edge : graph[currentNode]){
                int nextNode = edge[0];
                int newInfectionTime = infectedTime + edge[1];
                if(time[nextNode] <= newInfectionTime) continue;
                time[nextNode] = newInfectionTime;
                pq.offer(new int[]{nextNode, newInfectionTime});
            }
        }
        return time;
    }

    private static void output(int[] time){
        int cnt = 0;
        int maxTime = 0;
        for(int i=1; i<=N; i++){
            if(time[i]!=Integer.MAX_VALUE){
                cnt++;
                maxTime = Math.max(maxTime, time[i]);
            }
        }
        System.out.println(cnt+" "+maxTime);
    }
}
