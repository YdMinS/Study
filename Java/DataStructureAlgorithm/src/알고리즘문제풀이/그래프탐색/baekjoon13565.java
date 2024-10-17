package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon13565 {
    // 0 도체, 1 부도체
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static List<int[]> startPoints = new ArrayList<>();
    static boolean isFlowable = false;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(isFlowable ? "YES" : "NO");
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        for(int i=0; i<M; i++){
            if(map[0][i]==0){
                startPoints.add(new int[]{0, i});
            }
        }
    }

    private static void execute(){
        for(int[] point : startPoints){
            dfs(point[0], point[1]);
            if(isFlowable) return;
        }
    }

    private static void dfs(int x, int y){
        if(x==N-1){
            isFlowable = true;
            return;
        }
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny]==0 && !visited[nx][ny]){
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
}
