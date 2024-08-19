package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;
import java.lang.*;

public class baekjoon14503 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, cnt=0, x, y, d;
    static int[][] map, visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        input();
        execute();
        System.out.println(cnt);
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];
        for(int i=0; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void execute() {
        dfs(x, y, d);
    }

    static void dfs(int a, int b, int d){
        Stack<int[]> stack = new Stack<>();
        stack.add(new int[]{a, b, d});
        while(!stack.isEmpty()) {
            int[] cartesian = stack.pop();
            x = cartesian[0];
            y = cartesian[1];
            int currentD = cartesian[2];
            if(visited[x][y]==0) {
                visited[x][y] = 1;
                cnt++;
            }
            int nx;
            int ny;
            // 4칸 확인
            boolean cleanable = false;
            for(int i=0; i<4; i++){
                currentD = (currentD+3)%4;
                nx = x + dx[currentD];
                ny = y + dy[currentD];
                if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny]==0 && visited[nx][ny]==0) {
                    stack.add(new int[]{nx, ny, currentD});
                    cleanable = true;
                    break;
                }
            }
            // 후진
            if(!cleanable){
                nx = x + dx[(currentD+2)%4];
                ny = y + dy[(currentD+2)%4];
                if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny]==0) {
                    stack.add(new int[]{nx, ny, currentD});
                }
            }
        }
    }
}
