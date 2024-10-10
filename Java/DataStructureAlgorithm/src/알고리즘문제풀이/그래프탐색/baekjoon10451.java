package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon10451 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            input();
            execute();
        }
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        n = Integer.parseInt(br.readLine());
        map = new int[n+1];
        visited = new boolean[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void execute() throws IOException{
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                Stack<Integer> stack = new Stack();
                stack.add(i);
                while(!stack.isEmpty()){
                    int current = stack.pop();
                    visited[current] = true;
                    int next = map[current];
                    if(!visited[next]) stack.add(next);
                }
                cnt++;
            }
        }
        bw.append(cnt+"\n");
    }
}
