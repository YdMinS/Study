package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon25516 {
    static int N, k;
    static int[] apples;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(search());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        apples = new int[N];
        graph = new ArrayList[N];
        for(int i=0; i<N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<N-1; i++){
            st =new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            apples[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
    }

    private static int search(){
        int result = 0;
        int depth = 0;
        Queue<Integer> q = new LinkedList();
        boolean[] visited = new boolean[N+1];
        visited[0] = true;
        q.offer(0);
        while(!q.isEmpty() && depth <= k){
            int n = q.size();
            for(int i=0; i<n; i++) {
                int currentNode = q.poll();
                result += apples[currentNode];
                for(Integer nextNode : graph[currentNode]){
                    if(!visited[nextNode]){
                        q.offer(nextNode);
                        visited[nextNode] = true;
                    }
                }
            }
            depth++;
        }
        return result;
    }
}
