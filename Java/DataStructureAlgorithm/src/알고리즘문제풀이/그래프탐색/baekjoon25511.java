package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon25511 {
    static int N, targetValue;
    static List<Integer>[] graph;
    static int[] value;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(search());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        targetValue = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N];
        value = new int[N];
        for(int i=0; i<N; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            value[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
    }

    private static int search() {
        int depth = 0;
        boolean[] visited = new boolean[N];
        Queue<Integer> q = new LinkedList();
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++) {
                int currentNode = q.poll();
                if (value[currentNode] == targetValue) {
                    return depth;
                }
                for(int nextNode : graph[currentNode]){
                    if(!visited[nextNode]){
                        q.offer(nextNode);
                        visited[nextNode] = true;
                    }
                }
            }
            depth++;
        }
        return -1;
    }
}
