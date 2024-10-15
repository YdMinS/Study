package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon2210 {
    static int[][] map = new int[5][5];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Set<Integer> set = new HashSet();

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(set.size());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void execute(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i, j, 1, map[i][j]);
            }
        }
    }

    private static void dfs(int x, int y, int depth, int num){
        if(depth == 6){
            set.add(num);
            return;
        }
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<5 && ny<5){
                dfs(nx, ny, depth+1, num*10+map[nx][ny]);
            }
        }
    }
}
