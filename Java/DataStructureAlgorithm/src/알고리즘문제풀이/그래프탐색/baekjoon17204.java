package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon17204 {
    static int N, K, result=-1;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(result);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N];
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void execute(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(map[0]);
        int said = 1;
        while(!q.isEmpty() && said<N){
            int current = q.poll();
            if(current == K){
                result = said;
                return;
            }
            int next = map[current];
            q.offer(next);
            said++;
        }
    }
}
