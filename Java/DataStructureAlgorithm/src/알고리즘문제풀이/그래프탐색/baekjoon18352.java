package 알고리즘문제풀이.그래프탐색;

import java.io.*;
import java.util.*;
import java.lang.*;

public class baekjoon18352 {
    static int N, M, K, X;
    static List<Integer>[] map;
    static long[] minimumDistance;

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        map = new ArrayList[N+1];
        minimumDistance = new long[N+1];
        Arrays.fill(minimumDistance, -1);
        for(int i=1; i<=N; i++){
            map[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a].add(b);
        }
    }

    private static void execute(){
        Queue<Integer> q = new LinkedList();
        q.offer(X);
        minimumDistance[X] = 0;

        while(!q.isEmpty()){
            int current = q.poll();
            if(minimumDistance[current] == K) continue;
            for(int next : map[current]){
                if(minimumDistance[next] ==-1){
                    minimumDistance[next] = minimumDistance[current]+1;
                    q.offer(next);
                }
            }
        }

        boolean isFound = false;
        for(int i=1; i<=N; i++){
            if(minimumDistance[i]==K){
                System.out.println(i);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println(-1);
        }
    }
}
