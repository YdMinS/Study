package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon24444 {
    static int N, M, startNode;
    static List<Integer>[] list;
    static int[] visited;

    public static void main(String[] args) throws IOException{
        input();
        bfs(startNode);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        list = new ArrayList[N+1];
        visited = new int[N+1];
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
        for(int i=1; i<=N; i++){
            Collections.sort(list[i]);
        }
        br.close();
    }

    private static void bfs(int startNode) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(startNode);
        int cnt = 1;
        visited[startNode] = cnt;
        while(!q.isEmpty()){
            int currentNode = q.poll();
            for(int i : list[currentNode]){
                if(visited[i]==0){
                    cnt++;
                    visited[i] = cnt;
                    q.offer(i);
                }
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<=N; i++){
            bw.write(visited[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
