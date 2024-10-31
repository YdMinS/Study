package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon24447 {
    static int N, M, startNode;
    static List<Integer>[] graph;
    static int[] depth;
    static long[] order;

    public static void main(String[] args) throws IOException{
        input();
        execute();
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
        depth = new int[N+1];
        order = new long[N+1];
        Arrays.fill(depth, -1);
        Arrays.fill(order, 0);
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
    }

    private static void execute() {
        Queue<Integer> q = new LinkedList();
        long o = 1;
        order[startNode] = o++;
        depth[startNode] = 0;
        q.offer(startNode);
        while(!q.isEmpty()){
            int current = q.poll();
            for (int next : graph[current]) {
                if (depth[next] == -1) {
                    depth[next] = depth[current]+1;
                    order[next] = o++;
                    q.offer(next);
                }
            }
        }
    }

    private static void output(){
        long sum = 0;
        for(int i=1; i<=N; i++){
            sum += depth[i]*order[i];
        }
        System.out.println(sum);
    }
}
