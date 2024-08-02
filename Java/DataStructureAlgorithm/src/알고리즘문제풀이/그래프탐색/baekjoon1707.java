package 알고리즘문제풀이.그래프탐색;

import java.io.*;
import java.util.*;
import java.lang.*;

public class baekjoon1707 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int V, E;
    static int[] visited;
    static boolean isBipartite;
    static List<Integer>[] map;

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
    }

    static void setGraph() throws IOException{
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        map = new ArrayList[V+1];
        visited = new int[V+1];
        for(int i=1; i<=V; i++){
            map[i] = new ArrayList<>();
        }
        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a].add(b);
            map[b].add(a);
        }
    }


    static void execute() throws IOException{
        for(int i=0; i<N; i++){
            isBipartite = true;
            setGraph();
            proofBipartite();
            if(isBipartite){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static void proofBipartite(){
        for(int i=1; i<=V; i++){
            if(visited[i]!=0) continue;
            if(!dfs(i, 1)){
                isBipartite = false;
                return;
            }
        }
    }

    static boolean dfs(int node, int color){
        visited[node]=color;
        for(int i: map[node]){
            if(visited[i] == 0) {
                if(!dfs(i, 3-color)){
                    return false;
                }
            } else if (visited[i] == color){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
