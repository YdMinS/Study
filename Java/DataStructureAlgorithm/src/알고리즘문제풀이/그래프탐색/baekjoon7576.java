package 알고리즘문제풀이.그래프탐색;

import java.io.*;
import java.lang.*;
import java.util.*;

public class baekjoon7576 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int M, N, depth=-1;
    static int[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<int[]> q = new LinkedList<>();

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void execute() {
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(map[i][j]==1){
                    q.offer(new int[]{i, j});
                }
            }
        }
        calcuateMinDuration();
    }

    private static void calcuateMinDuration(){
        int tempDepth = -1;
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                int[] currentTuple = q.poll();
                int x = currentTuple[0];
                int y = currentTuple[1];
                for(int j=0; j<4; j++){
                    int newX = x + dx[j];
                    int newY = y + dy[j];
                    if(newX<1 || newY<1 || newX>N || newY>M) continue;
                    if(map[newX][newY]==1 || map[newX][newY]==-1) continue;
                    map[newX][newY]=1;
                    q.offer(new int[]{newX, newY});
                }
            }
            tempDepth++;
        }
        depth = tempDepth>depth ? tempDepth : depth;
    }

    static void output() {
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(map[i][j]==0) depth = -1;
            }
        }
        System.out.println(depth);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
        output();
    }
}
