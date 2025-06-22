package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon31217 {
    static int N, M;
    static final int MOD = 1000000007;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(search());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        br.close();
    }

    private static long search(){
        long cnt = 0;
        for(int i=1; i<=N; i++){
            long size = graph[i].size();
            if(size>=3){
                cnt += calculateCombination(size) % MOD;
            }
        }
        return cnt;
    }

    private static long calculateCombination(long n){
        return n * (n-1) * (n-2) / 6;
    }
}
