package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon11123 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, n, m;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            input();
            execute();
        }
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = str.charAt(j);
            }
        }
    }

    private static void execute() throws IOException{
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]=='#' && !visited[i][j]){
                    bfs(i, j);
                    cnt++;
                }
            }
        }
        bw.write(cnt+"\n");
    }

    private static void bfs(int a, int b){
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{a, b});
        while(!q.isEmpty()){
            int[] currentNode = q.poll();
            int x = currentNode[0];
            int y = currentNode[1];
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny >=0 && nx<n && ny<m && map[nx][ny]=='#' && !visited[nx][ny]){
                    q.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
