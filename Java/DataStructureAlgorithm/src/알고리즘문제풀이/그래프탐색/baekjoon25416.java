package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon25416 {
    static int min = Integer.MAX_VALUE;
    static int[] startNode = new int[2];
    static int[][] graph = new int[5][5];
    static boolean[][] visited = new boolean[5][5];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        search();
        System.out.println(min==Integer.MAX_VALUE ? "-1" : min);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        startNode[0] = Integer.parseInt(st.nextToken());
        startNode[1] = Integer.parseInt(st.nextToken());
        br.close();
    }

    private static void search() {
        Queue<int[]> q = new LinkedList();
        int a = startNode[0];
        int b = startNode[1];
        visited[a][b] = true;
        q.offer(new int[]{startNode[0], startNode[1], 0});
        while(!q.isEmpty()){
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int depth = current[2];
            if(graph[x][y]==1){
                min = Math.min(depth, min);
                continue;
            }
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<5 && ny<5 && graph[nx][ny]!=-1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny, depth+1});
                }
            }
        }
    }
}
