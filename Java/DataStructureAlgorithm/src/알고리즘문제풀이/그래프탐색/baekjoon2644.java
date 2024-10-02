package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon2644 {
    static int N, a, b, M;
    static List<Integer>[] graph;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        input();
        search(a);
        System.out.println(distance[b]==0 ? -1 : distance[b]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList();
        }
        distance = new int[N+1];
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
    }

    private static void search(int x){
        Queue<Integer> q = new LinkedList();
        q.offer(x);

        while(!q.isEmpty()){
            int current = q.poll();
            if(current==b) return;
            for(int next : graph[current]){
                if(distance[next] == 0){
                    distance[next] = distance[current]+1;
                    q.offer(next);
                }
            }
        }
    }
}
