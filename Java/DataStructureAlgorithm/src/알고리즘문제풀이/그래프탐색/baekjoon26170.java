package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon26170 {
    static int[][] map = new int[5][5];
    static int r, c, min=Integer.MAX_VALUE;
    static boolean[][] visited = new boolean[5][5];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(min!=Integer.MAX_VALUE ? min : -1);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    private static void execute(){
        dfs(r, c,  0, 0);
    }

    private static void dfs(int x, int y, int num, int depth){
        if(map[x][y]==1) num++;
        if(num==3){
            min = Math.min(min, depth);
            return;
        }
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<5 && ny<5 && !visited[nx][ny] && map[nx][ny]!=-1){
                dfs(nx, ny, num, depth+1);
            }
        }
        visited[x][y] = false;
    }
}
