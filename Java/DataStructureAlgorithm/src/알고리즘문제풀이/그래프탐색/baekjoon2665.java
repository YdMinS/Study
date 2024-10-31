package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon2665 {
    static int N;
    static int[][] graph, removedDark;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(removedDark[N-1][N-1]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        removedDark = new int[N][N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            Arrays.fill(removedDark[i], Integer.MAX_VALUE);
            for(int j=0; j<N; j++){
                graph[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        br.close();
    }

    private static void execute() {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(removedDark[a[0]][a[1]],
                removedDark[b[0]][b[1]]));
        removedDark[0][0] = 0;
        pq.offer(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int x = current[0];
            int y = current[1];

            if(x==N-1 && y==N-1) return;

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<N){
                    if(graph[nx][ny]==1 && removedDark[nx][ny]>removedDark[x][y]){
                        removedDark[nx][ny] = removedDark[x][y];
                        pq.offer(new int[]{nx, ny});
                        continue;
                    }
                    if(graph[nx][ny]==0 && removedDark[nx][ny]>removedDark[x][y]+1){
                        removedDark[nx][ny] = removedDark[x][y] + 1;
                        pq.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
