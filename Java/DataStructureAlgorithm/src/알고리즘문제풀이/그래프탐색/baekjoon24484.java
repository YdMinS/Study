package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon24484 {
    static int N, M, startNode;
    static long order = 1;
    static List<Integer>[] graph;
    static long[] visited;

    public static void main(String[] args) throws IOException {
        input();
        dfs(startNode, 0);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        visited = new long[N+1];
        Arrays.fill(visited, -1);
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

    private static void dfs(int node, long depth){
        visited[node] = depth * order;
        order++;

        for(int nextNode : graph[node]){
            if(visited[nextNode]==-1){
                dfs(nextNode, depth+1);
            }
        }
    }

    private static void output(){
        long result = 0;
        for(long num : visited){
            if(num==-1) continue;
            result += num;
        }
        System.out.println(result);
    }
}
