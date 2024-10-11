package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon5567 {
    static int N, M;
    static List<Integer>[] graph;
    static boolean visited[];

    public static void main(String[] args) throws IOException{
        input();
        bfs();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph[from].add(to);
            graph[to].add(from);
        }
    }

    private static void bfs(){
        Queue<Integer> q = new LinkedList();
        q.offer(1);
        visited[1] = true;
        for(int i=0; i<2; i++){
            int n = q.size();
            for(int j=0; j<n; j++){
                int currentNode = q.poll();
                for(int nextNode : graph[currentNode]){
                    if(!visited[nextNode]){
                        q.offer(nextNode);
                        visited[nextNode] = true;
                    }
                }
            }
        }
    }

    private static void output(){
        int cnt = 0;
        for(int i=2; i<=N; i++){
            cnt += visited[i] ? 1 : 0;
        }
        System.out.println(cnt);
    }
}
