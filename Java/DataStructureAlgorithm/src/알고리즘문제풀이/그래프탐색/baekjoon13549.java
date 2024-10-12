package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon13549 {
    static final int MAX = 100001;
    static int X, K, T;

    public static void main(String[] args) throws IOException{
        input();
        dijkstra(X, K);
        System.out.println(T);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    private static void dijkstra(int start, int end) {
        int dist[] = new int[MAX];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{start, 0});
        dist[start] = 0;

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int position = current[0];
            int time = current[1];

            if(position == end) {
                T = time;
                return;
            }

            if(dist[position] < time) continue;

            if(position*2<MAX && time<dist[position*2]){
                dist[position*2] = time;
                pq.offer(new int[]{position*2, time});
            }

            if(position+1<MAX && time+1<dist[position+1]){
                dist[position+1] = time+1;
                pq.offer(new int[]{position+1, time+1});
            }

            if(position-1>=0 && time+1<dist[position-1]){
                dist[position-1] = time+1;
                pq.offer(new int[]{position-1, time+1});
            }
        }
        T = -1;
    }
}
