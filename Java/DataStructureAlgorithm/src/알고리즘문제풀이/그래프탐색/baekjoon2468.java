package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon2468 {
    static int N, cnt=0, maxHeight = 0, maxCnt;
    static int map[][];
    static boolean visited[][];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        for(int i=1; i<=maxHeight; i++) {
            visited = new boolean[N][N];
            search(i);
            maxCnt = Math.max(cnt, maxCnt);
            cnt = 0;
        }
        System.out.println(maxCnt);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(map[i][j], maxHeight);
            }
        }
    }

    private static void search(int height){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j]>=height && !visited[i][j]){
                    cnt++;
                    visited[i][j] = true;
                    dfs(i, j, height);
                }
            }
        }
    }

    private static void dfs(int x, int y, int height){
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<N && map[nx][ny]>=height && !visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(nx, ny, height);
            }
        }
    }
}
