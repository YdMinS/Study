package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon14248 {
    static int N, startNode;
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N+1];
        visited = new boolean[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        startNode = Integer.parseInt(br.readLine());
    }

    private static void execute(){
        visited[startNode] = true;
        dfs(startNode);

    }

    private static void dfs(int node){
        int value = map[node];
        int left = node - value;
        int right = node + value;

        if(left>0 && !visited[left]){
            visited[left] = true;
            dfs(left);
        }

        if(right<=N && !visited[right]){
            visited[right] = true;
            dfs(right);
        }
    }

    private static void output(){
        int result = 0;
        for(boolean tf : visited){
            result += tf ? 1 : 0;
        }
        System.out.println(result);
    }
}
