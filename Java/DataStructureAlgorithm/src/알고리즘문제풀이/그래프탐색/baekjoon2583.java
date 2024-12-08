package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon2583 {
    static int N, M, cnt=0;
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> list = new ArrayList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        input();
        search();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int j=y1; j<y2; j++){
                for(int k=x1; k<x2; k++){
                    map[j][k] = 1;
                }
            }
        }
    }

    private static void search(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==0 && !visited[i][j]){
                    visited[i][j] = true;
                    dfs(i, j);
                    list.add(cnt);
                    cnt = 0;
                }
            }
        }
    }

    private static void dfs(int x, int y){
        cnt++;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny]==0 && !visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Collections.sort(list);
        bw.append(list.size()+"\n");
        for(int i=0; i<list.size(); i++){
            bw.append(list.get(i)+"");
            if(i+1!=list.size()){
                bw.append(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
