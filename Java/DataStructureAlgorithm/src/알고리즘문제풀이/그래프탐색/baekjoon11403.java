package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon11403 {
    static int N;
    static int[][] result;
    static List<Integer>[] list;

    public static void main(String[] args) throws IOException{
        input();
        search();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N];
        for(int i=0; i<N; i++){
            list[i] = new ArrayList<>();
        }
        result = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num == 1){
                    list[i].add(j);
                }
            }
        }
    }

    private static void search(){
        for(int i=0; i<N; i++){
            dfs(i, i);
        }
    }

    private static void dfs(int start, int node){
        for(int next : list[node]){
            if(result[start][next] == 0){
                result[start][next] = 1;
                dfs(start, next);
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                bw.append(result[i][j]+"");
                if(j+1!=N){
                    bw.append(" ");
                } else {
                    bw.append("\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
