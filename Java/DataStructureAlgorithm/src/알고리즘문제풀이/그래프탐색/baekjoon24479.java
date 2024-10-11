package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon24479 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M, startNode, order = 1;
    static List<Integer>[] map;
    static int[] visited;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        map = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            map[i] = new ArrayList();
        }
        visited = new int[N+1];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            map[from].add(to);
            map[to].add(from);
        }
        br.close();
        for(int i=1; i<=N; i++){
            Collections.sort(map[i]);
        }
    }

    private static void execute(){
        dfs(startNode);
    }

    private static void dfs(int node){
        visited[node] = order++;
        for(int nextNode : map[node]){
            if(visited[nextNode] == 0){
                dfs(nextNode);
            }
        }
    }

    private static void output() throws IOException{
        for(int i=1; i<=N; i++){
            bw.append(visited[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
