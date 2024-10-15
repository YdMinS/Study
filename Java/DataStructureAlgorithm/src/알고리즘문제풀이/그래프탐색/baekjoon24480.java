package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon24480 {
    static int N, M, start, index=1;
    static List<Integer>[] graph;
    static int[] visited;

    public static void main(String[] args) throws IOException{
        input();
        dfs(start);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        graph = new LinkedList[N+1];
        visited = new int[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new LinkedList<>();
        }
        for(int i=0; i<M; i++){
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

    private static void dfs(int node){
        visited[node] = index;
        index++;
        for(int nextNode : graph[node]){
            if(visited[nextNode]==0){
                dfs(nextNode);
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<=N; i++){
            bw.write(visited[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
