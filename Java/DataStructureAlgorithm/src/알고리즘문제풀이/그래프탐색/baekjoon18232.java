package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon18232 {
    static int N, M, S, E;
    static List<Integer>[] graph;
    static int[] time;

    public static void main(String[] args) throws IOException{
        input();
        search();
        System.out.println(time[E]);
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
        time = new int[N+1];
        Arrays.fill(time, Integer.MAX_VALUE);
        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
    }

    private static void search(){
        Queue<int[]> q = new LinkedList<>();
        time[S] = 0;
        q.offer(new int[]{S, time[S]});
        while(!q.isEmpty()){
            int[] current = q.poll();
            int currentNode = current[0];
            int currentTime = current[1];

            if(currentNode == E) return;

            if(time[currentNode] < currentTime) continue;

            if(currentNode-1>0){
                int nextNode = currentNode-1;
                int newTime = currentTime+1;
                if(newTime<time[nextNode]){
                    time[nextNode] = newTime;
                    q.offer(new int[]{nextNode, newTime});
                }
            }

            if(currentNode+1<=N){
                int nextNode = currentNode+1;
                int newTime = currentTime+1;
                if (newTime < time[nextNode]){
                    time[nextNode] = newTime;
                    q.offer(new int[]{nextNode, newTime});
                }
            }

            for(int nextNode : graph[currentNode]){
                int newTime = currentTime+1;
                if(newTime < time[nextNode]){
                    time[nextNode] = newTime;
                    q.offer(new int[]{nextNode, newTime});
                }
            }
        }
    }
}
