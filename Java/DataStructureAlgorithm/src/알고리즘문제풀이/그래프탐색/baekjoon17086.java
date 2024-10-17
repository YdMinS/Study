package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon17086 {
    static int N, M, maxSafeDistance;
    static int[][] map, distance;
    static List<int[]> sharkLocation = new ArrayList<>();
    static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        bfs();
        System.out.println(maxSafeDistance);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        distance = new int[N][M];
        for(int i=0; i<N; i++) {
            Arrays.fill(distance[i], -1);
        }
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    sharkLocation.add(new int[]{i, j});
                    distance[i][j] = 0;
                }
            }
        }
    }

    private static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        for(int[] shark : sharkLocation) {
            int a = shark[0];
            int b = shark[1];
            q.offer(new int[]{a, b});
        }
        int cnt = 1;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++){
                int[] ref = q.poll();
                int x = ref[0];
                int y = ref[1];
                for(int j=0; j<8; j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny]==0 && distance[nx][ny]==-1){
                        distance[nx][ny] = cnt;
                        q.offer(new int[]{nx,ny});
                        maxSafeDistance = Math.max(maxSafeDistance, cnt);
                    }
                }
            }
            cnt++;
        }
    }
}
