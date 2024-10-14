package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon21736 {
    static int N, M, cnt=0, ix, iy;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j);
                if(map[i][j]=='I'){
                    ix = i;
                    iy = j;
                }
            }
        }
    }

    private static void execute(){
        Stack<int[]> stack = new Stack<>();
        visited[ix][iy] = true;
        stack.add(new int[]{ix, iy});
        while(!stack.isEmpty()){
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<M && map[nx][ny]!='X' && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    if(map[nx][ny]=='P'){
                        cnt++;
                    }
                    stack.add(new int[]{nx, ny});
                }
            }
        }
    }

    private static void output() {
        if(cnt==0){
            System.out.println("TT");
        } else {
            System.out.println(cnt);
        }
    }
}
