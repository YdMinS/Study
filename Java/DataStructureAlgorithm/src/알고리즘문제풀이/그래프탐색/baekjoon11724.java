package 알고리즘문제풀이.그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon11724 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int node, edge;
    static boolean[][] map;
    static boolean[] visited;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        map = new boolean[node+1][node+1];
        visited = new boolean[node+1];


        for(int i=0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = true;
            map[b][a] = true;
        }
    }

    static int execute(){
        int result = 0;

        for(int i=1; i<node+1; i++){
            if(!visited[i]){
                dfs(i);
                result++;
            }
        }

        return result;
    }

    static void dfs(int x){
        if(!visited[x]) {
            visited[x] = true;
            for(int i=1; i<node+1; i++){
                if(map[x][i]){
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(execute());
    }
}
