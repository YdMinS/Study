package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon16502 {
    static int time, N;
    static double[][] graph = new double[4][4];
    static double[] percent = new double[4];

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        time = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        graph = new double[4][4];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int from = st.nextToken().charAt(0)-'A';
            int to = st.nextToken().charAt(0)-'A';
            double p = Double.parseDouble(st.nextToken());
            graph[from][to] = p;
        }
    }

    private static void execute(){
        for(int i=0; i<4; i++){
            dfs(i, 0.25, 0);
        }
    }

    private static void dfs(int to, double p, int depth){
        if(depth==time){
            percent[to] += p;
            return;
        }
        for(int i=0; i<4; i++){
            if(graph[to][i]!=0) {
                double np = graph[to][i];
                dfs(i, p * np, depth + 1);
            }
        }
    }

    private static void output()throws IOException{
        for(double i : percent){
            System.out.printf("%.2f\n", i*100);
        }
    }
}
