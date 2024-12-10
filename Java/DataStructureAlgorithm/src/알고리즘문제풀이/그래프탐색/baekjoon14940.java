package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon14940 {
    static int N, M;
    static int[] startNode = new int[2];
    static int[][] map, result;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        search();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    startNode[0] = i;
                    startNode[1] = j;
                }
            }
        }
    }

    private static void search(){
        result = new int[N][M];
        Queue<int[]> q = new LinkedList<>();
        q.offer(startNode);
        int index = 1;
        while(!q.isEmpty()){
            int n = q.size();
            for(int c=0; c<n; c++) {
                int[] node = q.poll();
                int x = node[0];
                int y = node[1];
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny]==1 && result[nx][ny] == 0) {
                        result[nx][ny] = index;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
            index++;
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==1 && result[i][j]==0){
                    result[i][j] = -1;
                }
                bw.write(result[i][j]+"");
                if(j+1==M){
                    bw.write("\n");
                } else {
                    bw.write(" ");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
