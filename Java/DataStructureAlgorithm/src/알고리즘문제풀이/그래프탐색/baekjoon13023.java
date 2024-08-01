package 알고리즘문제풀이.그래프탐색;

import java.io.*;
import java.util.*;
import java.lang.*;

public class baekjoon13023 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer>[] map;
    static int[] visited;
    static int N, depth;
    static boolean isFound;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new ArrayList[N];
        visited = new int[N];
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            map[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a].add(b);
            map[b].add(a);
        }
    }

    static void execute() {
        for(int i=0; i<N; i++) {
            if(isFound) {
                System.out.println(1);
                return;
            }
            depth = 0;
            dfs(i);
        }
        if(!isFound) {
            System.out.println(0);
        }
    }

    public static void dfs(int from){
        if(depth == 4){
            isFound = true;
            return;
        }
        visited[from] = 1;
        for(int next: map[from]){
            if(visited[next]==0){
                depth++;
                dfs(next);
                if(isFound) return;
                depth--;
            }
        }
        visited[from] =0;
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
