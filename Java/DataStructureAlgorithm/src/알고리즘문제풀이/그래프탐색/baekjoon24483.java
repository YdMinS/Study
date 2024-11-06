package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon24483 {
    static int N, M, startNode, orderNum=1;
    static List<Integer>[] graph;
    static long depth[], order[];

    public static void main(String[] args) throws IOException{
        input();
        dfs(startNode, 0);
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList();
        }
        depth = new long[N+1];
        Arrays.fill(depth, -1);
        order = new long[N+1];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i]);
        }
        br.close();
    }

    private static void dfs(int node, int depthNum){
        depth[node] = depthNum;
        order[node] = orderNum++;
        for(int nextNode : graph[node]){
            if(depth[nextNode]==-1){
                dfs(nextNode, depthNum+1);
            }
        }
    }

    private static void output() {
        long result = 0;
        for(int i=1; i<=N; i++){
            result += order[i] * depth[i];
        }
        System.out.println(result);
    }
}
