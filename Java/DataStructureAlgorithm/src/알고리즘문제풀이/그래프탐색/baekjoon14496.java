package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon14496 {
    static int a, b, N, M;
    static List<Integer>[] list;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(bfs());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        br.close();
    }

    private static int bfs() {
        boolean[] visited = new boolean[N+1];
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{a, 0});
        visited[a] = true;
        while(!q.isEmpty()){
            int[] current = q.poll();
            int node = current[0];
            int depth = current[1];
            if(node==b){
                return depth;
            }
            for(int next : list[node]){
                if(!visited[next]){
                    q.offer(new int[]{next, depth+1});
                    visited[next] = true;
                }
            }
        }
        return -1;
    }
}
