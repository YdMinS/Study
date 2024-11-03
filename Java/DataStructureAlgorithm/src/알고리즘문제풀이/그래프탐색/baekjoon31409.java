package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon31409 {
    static int N, changes=0;
    static int[] graph, result;
    static boolean[] visited, inStack;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        graph = new int[N+1];
        result = new int[N+1];
        visited = new boolean[N+1];
        inStack = new boolean[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = Integer.parseInt(st.nextToken());
            result[i] = graph[i];
        }
        br.close();
        for(int i=1; i<=N; i++){
            if(!visited[i]) search(i);
        }
        System.out.println(changes);
        for(int i=1; i<=N; i++){
            stringBuilder.append(result[i]);
            if(i!=N) stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }

    private static void search(int index){
        visited[index] = true;
        inStack[index] = true;
        int next = graph[index];
        if(!visited[next]){
            search(next);
        } else {
            if(index==next){
                result[index] = index%N +1;
                changes++;
            }
        }
    }
}
