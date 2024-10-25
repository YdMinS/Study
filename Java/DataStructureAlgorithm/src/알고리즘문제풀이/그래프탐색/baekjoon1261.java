package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon1261 {
    static int N, M;
    static int[][] graph, destroyed;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Point implements Comparable<Point>{
        int x, y, cost;

        public Point(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Point other){
            return this.cost - other.cost;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        dijkstra();
        System.out.println(destroyed[N-1][M-1]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        destroyed = new int[N][M];
        for(int i=0; i<N; i++){
            Arrays.fill(destroyed[i], Integer.MAX_VALUE);
        }
        destroyed[0][0] = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                int roomInfo = Character.getNumericValue(str.charAt(j));
                graph[i][j] = roomInfo;
            }
        }
        br.close();
    }

    private static void dijkstra(){
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.offer(new Point(0,0,0));

        while(!pq.isEmpty()){
            Point current = pq.poll();
            int x = current.x;
            int y = current.y;
            if(x==N-1 && y==M-1) return;

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<M){
                    int newCost = destroyed[x][y] + graph[nx][ny];
                    if(newCost < destroyed[nx][ny]){
                        destroyed[nx][ny] = newCost;
                        pq.offer(new Point(nx, ny, newCost));
                    }
                }
            }
        }

    }
}
