package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon24481 {
    static int N, M, startNode;
    static List<Integer>[] graph;
    static int[] depthArr;

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
        graph = new List[N+1];
        depthArr = new int[N+1];
        Arrays.fill(depthArr, -1);
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
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i]);
        }
        br.close();
    }

    private static void dfs(int visitingNode, int depth){
        depthArr[visitingNode] = depth;
        for(int nextNode : graph[visitingNode]){
            if(depthArr[nextNode]==-1){
                dfs(nextNode, depth+1);
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<=N; i++){
            bw.write(depthArr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}