package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon24446 {
    static int N, M, startNode;
    static List<Integer>[] graph;
    static int[] visited;

    public static void main(String[] args) throws IOException{
        input();
        bfs(startNode);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        visited = new int[N+1];
        Arrays.fill(visited, -1);
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        br.close();
    }

    private static void bfs(int startNode){
        Queue<Integer> q = new LinkedList();
        q.offer(startNode);
        visited[startNode] = 0;
        while(!q.isEmpty()){
            int currentNode = q.poll();
            for(int i : graph[currentNode]){
                if(visited[i]==-1){
                    q.offer(i);
                    visited[i] = visited[currentNode]+1;
                }
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
