package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11725 {
    static int N;
    static int[] parentNode;
    static boolean[] visited;
    static List<Integer>[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        parentNode = new int[N+1];
        visited = new boolean[N+1];
        map = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            map[i] = new ArrayList<>();
        }
        for(int i=1; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a].add(b);
            map[b].add(a);
        }
    }

    private static void execute(){
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        visited[1] = true;
        while(!stack.isEmpty()){
            int node = stack.pop();
            if(map[node].isEmpty()) continue;
            for(int i: map[node]){
                if(visited[i]) continue;
                parentNode[i] = node;
                stack.add(i);
                visited[i] = true;
            }
        }
    }

    private static void output(){
        StringBuilder str = new StringBuilder();
        for(int i=2; i<=N; i++) {
            str.append(parentNode[i]+"\n");
        }
        System.out.println(str);
    }
}
