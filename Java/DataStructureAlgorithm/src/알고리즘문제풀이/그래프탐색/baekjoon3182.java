package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.io.*;

public class baekjoon3182 {
    static int N, result, maxDepth=0;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(result);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N+1];
        for(int i=1; i<=N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void execute() {
        for(int i=1; i<=N; i++){
            boolean[] visited = new boolean[N+1];
            visited[i] = true;
            int depth = 1;
            int next = map[i];
            while(!visited[next]){
                visited[next] = true;
                depth++;
                next = map[next];
            }
            if(depth > maxDepth){
                maxDepth = depth;
                result = i;
            }
        }
    }
}
