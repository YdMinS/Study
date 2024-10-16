package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon24445 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M, s;
    static List<Integer>[] graph;
    static int[] visited;

    public static void main(String[] args) throws IOException{
        input();
        bfs(s);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        visited = new int[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        br.close();
    }

    private static void bfs(int node){
        Queue<Integer> q = new LinkedList();
        q.offer(node);
        int index = 1;
        visited[node] = index;
        while(!q.isEmpty()){
            int currentNode = q.poll();
            for(int i : graph[currentNode]){
                if(visited[i]==0){
                    index++;
                    q.offer(i);
                    visited[i] = index;
                }
            }
        }
    }

    private static void output() throws IOException{
        for(int i=1; i<=N; i++){
            bw.write(visited[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
