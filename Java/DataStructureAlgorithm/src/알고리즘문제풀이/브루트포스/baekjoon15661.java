package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.util.*;
import java.io.*;

public class baekjoon15661 {
    static int N, min = Integer.MAX_VALUE;
    static int[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(min);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void execute(){
        visited = new boolean[N];
        dfs(0,0);
    }

    private static void dfs(int index, int count){
        if(index == N){
            if(count>0 && count<N){
                calculateMinimum();
            }
            return;
        }
        visited[index] = true;
        dfs(index+1, count+1);
        visited[index] = false;
        dfs(index+1, count);
    }

    private static void calculateMinimum(){
        int t1 = 0;
        int t2 = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(visited[i] && visited[j]){
                    t1 += map[i][j] + map[j][i];
                } else if(!visited[i] && !visited[j]){
                    t2 += map[i][j] + map[j][i];
                }
            }
        }
        int dif = Math.abs(t1-t2);
        min = Math.min(dif, min);
    }
}