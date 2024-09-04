package 알고리즘문제풀이.브루트포스;

import java.io.*;
import java.lang.*;
import java.util.*;

public class beakjoon14889 {
    static int N, min=Integer.MAX_VALUE;
    static int[][] map;
    static int[] t1, t2;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        input();
        execute();
        System.out.println(min);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        t1 = new int[N/2];
        t2 = new int[N/2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void execute() {
        for(int i=0; i<N; i++){
            visited = new boolean[N];
            visited[i] = true;
            t1[0] = i;
            dfs(i+1, 1);
        }
    }

    private static void dfs(int index, int depth){
        if(depth == N/2){
            int _index = 0;
            for(int i=0; i<N; i++){
                if(!visited[i]){
                    t2[_index] = i;
                    _index++;
                }
            }
            calculateDif();
            return;
        }
        for(int i=index; i<N; i++){
            if(!visited[i]){
                t1[depth] = i;
                visited[i] = true;
                dfs(i+1, depth+1);
                visited[i] = false;
            }
        }
    }

    private static void calculateDif(){
        int strength1 = 0;
        int strength2 = 0;
        for(int i=0; i<N/2; i++){
            for(int j=0; j<N/2; j++){
                if(i==j) continue;
                strength1 += map[t1[i]][t1[j]];
                strength2 += map[t2[i]][t2[j]];
            }
        }
        int dif = strength1>=strength2 ? strength1-strength2 : strength2-strength1;
        min = Math.min(dif, min);
    }
}
