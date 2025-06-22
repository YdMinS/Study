package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon1389 {
    static int N, M;
    static List<Integer>[] list;
    static int[][] result;

    public static void main(String[] args) throws IOException{
        input();
        search();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
    }

    private static void search(){
        result = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int next : list[i]) {
                dfs(i, next, 1);
            }
        }
    }

    private static void dfs(int from, int to, int depth){
        if(result[from][to]==0 || result[from][to]>depth){
            result[from][to] = depth;
        }
        for(int next : list[to]){
            if(result[from][next]==0 || result[from][next]>depth+1)
            dfs(from, next, depth+1);
        }
    }

    private static void output(){
        int min = Integer.MAX_VALUE;
        int[] map = new int[N+1];
        for(int i=1; i<=N; i++){
            int sum = 0;
            for(int node : list[i]){
                sum += node;
            }
            map[i] = sum;
            if(sum < min){
                min = sum;
            }
        }
        List<Integer> toPrint = new ArrayList<>();
        for(int i=1; i<=N; i++){
            if(map[i] == min){
                toPrint.add(i);
            }
        }
        Collections.sort(toPrint);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<toPrint.size(); i++){
            sb.append(toPrint.get(i)+"");
            if(i+1!=toPrint.size()){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
