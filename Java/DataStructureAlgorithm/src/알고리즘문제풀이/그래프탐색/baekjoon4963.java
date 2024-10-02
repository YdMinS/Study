package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon4963 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0 ,-1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        b = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        while(a!=0 && b!=0){
            map = new int[a][b];
            visited = new boolean[a][b];
            for(int i=0; i<a; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<b; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            for(int i=0; i<a; i++){
                for(int j=0; j<b; j++){
                    if(map[i][j]!=0 && !visited[i][j]){
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            bw.append(cnt+"\n");
            st = new StringTokenizer(br.readLine());
            b = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<a && ny<b && map[nx][ny]==1 && !visited[nx][ny]){
                dfs(nx, ny);
            }
        }
    }
}
