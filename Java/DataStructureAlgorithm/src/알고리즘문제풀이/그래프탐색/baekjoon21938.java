package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon21938 {
    static int N, M, ref;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int R = Integer.parseInt(st.nextToken());
                int G = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                graph[i][j] = (R+G+B)/3;
            }
        }
        ref = Integer.parseInt(br.readLine());
        br.close();
    }

    private static int execute(){
        int cnt = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!visited[i][j]){
                    visited[i][j] = true;
                    if(graph[i][j]>=ref) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    private static void dfs(int x, int y){
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<M && !visited[nx][ny]){
                visited[nx][ny] = true;
                if(graph[nx][ny]>=ref){
                    dfs(nx, ny);
                }
            }
        }
    }
}
