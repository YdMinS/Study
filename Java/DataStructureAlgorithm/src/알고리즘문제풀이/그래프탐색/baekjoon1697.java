package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1697 {
    static int X, K;
    static final int MAX_K = 100000;
    static boolean[] visited = new boolean[MAX_K+1];

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    private static int execute() {
        Queue<Integer> q = new LinkedList();
        int time = 0;
        q.offer(X);
        visited[X] = true;

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                int current = q.poll();
                if(current==K){
                    return time;
                }

                if(current-1 >=0 && !visited[current-1]){
                    q.offer(current-1);
                    visited[current-1] = true;
                }
                if(current+1 <= MAX_K && !visited[current+1]) {
                    q.offer(current + 1);
                    visited[current + 1] = true;
                }
                if(current*2 <=MAX_K && !visited[current*2]){
                    q.offer(current*2);
                    visited[current*2] = true;
                }
            }
            time++;
        }
        return -1;
    }
}
