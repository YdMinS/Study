package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1584 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    // 안전 0, 위험 1, 죽음 -1
    static int[][] map = new int[501][501];
    static int[][] lostLife = new int[501][501];
    static {
        for(int i=0; i<=500; i++){
            Arrays.fill(lostLife[i], Integer.MAX_VALUE);
        }
    }
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class District implements Comparable<District>{
        int x, y;
        int lostLife;

        public District(int x, int y, int lostLife){
            this.x = x;
            this.y = y;
            this.lostLife = lostLife;
        }

        @Override
        public int compareTo(District other){
            return this.lostLife - other.lostLife;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        int dangerZone = Integer.parseInt(br.readLine());
        setZone(dangerZone, 1);
        int forbiddenZone = Integer.parseInt(br.readLine());
        setZone(forbiddenZone, -1);
    }

    private static void setZone(int count, int value) throws IOException{
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int j=Math.min(x1, x2); j<=Math.max(x1, x2); j++){
                for(int k=Math.min(y1, y2); k<=Math.max(y1, y2); k++){
                    map[j][k] = value;
                }
            }
        }
    }

    private static void execute() {
        PriorityQueue<District> pq = new PriorityQueue();
        pq.offer(new District(0, 0, 0));
        lostLife[0][0] = 0;
        while(!pq.isEmpty()){
            District current = pq.poll();
            if(current.x == 500 && current.y == 500){
                System.out.println(lostLife[current.x][current.y]);
                return;
            }
            for(int i=0; i<4; i++){
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if(nx>=0 && ny>=0 && nx<=500 && ny<=500 && map[nx][ny]!=-1){
                    int newLostLife = current.lostLife + map[nx][ny];
                    if(newLostLife < lostLife[nx][ny]){
                        lostLife[nx][ny] = newLostLife;
                        pq.offer(new District(nx, ny, newLostLife));
                    }
                }
            }
        }
        System.out.println("-1");
    }
}
