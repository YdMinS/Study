package 알고리즘문제풀이.그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, V;
    static boolean[] visited;
    static int[][] map;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        map = new int[N+1][N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            map[src][dst] = 1;
            map[dst][src] = 1;
        }
    }

    static void dfs(int node){
        visited[node] = true;
        System.out.print(node+" ");
        for(int i=1; i<=N; i++){
            if(map[node][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        while(!q.isEmpty()){
            int currentNode = q.poll();
            System.out.print(currentNode+" ");
            for(int i=1; i<=N; i++){
                if(map[currentNode][i]==1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void execute() {
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
