package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon31575 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,1};
    static int[] dy = {1,0};

    public static void main(String[] args) throws IOException{
        input();
        if(dfs(0,0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static boolean dfs(int x, int y){
        visited[x][y] = true;
        if(x==N-1 && y==M-1){
            return true;
        }
        for(int i=0; i<2; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<N && ny<M && map[nx][ny]==1 && !visited[nx][ny]){
                if(dfs(nx, ny)){
                    return true;
                }
            }
        }
        return false;
    }
}
