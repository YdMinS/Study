package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.util.*;
import java.io.*;

public class baekjoon7562 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[][] points;
    static int[][] map;
    static int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
    static int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
    }

    static void execute() throws IOException{
        for(int i=0; i<N; i++) {
            readCase();
            searchPath();
        }
    }

    static void readCase() throws IOException {
        M = Integer.parseInt(br.readLine());
        map = new int[M][M];
        points = new int[2][2];
        for(int i=0; i<2; i++){
            st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    static void searchPath(){
        Queue<int[]> q = new LinkedList<>();
        int depth = -1;
        int startX = points[0][0];
        int startY = points[0][1];
        map[startX][startY] = 1;
        q.offer(new int[]{startX, startY});
        while(!q.isEmpty()) {
            int currentQSize = q.size();
            depth++;
            for(int i=0; i<currentQSize; i++) {
                int[] tuple = q.poll();
                int x = tuple[0];
                int y = tuple[1];
                if(x==points[1][0] && y==points[1][1]){
                    System.out.println(depth);
                    return;
                }
                for (int j = 0; j < 8; j++) {
                    int newX = x + dx[j];
                    int newY = y + dy[j];
                    if(newX < 0 || newY < 0 || newX >= M || newY >= M) continue;
                    if (map[newX][newY] == 0) {
                        map[newX][newY] = 1;
                        q.offer(new int[]{newX, newY});
                    }
                }
            }
        }
    }
}

