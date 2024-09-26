package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11558 {
    static int T;
    static int[] cases;
    static List<Integer>[] plays;

    public static void main(String[] args) throws IOException{
        input();
        for(int i=0; i<T; i++) {
            play(i);
        }
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        cases = new int[T];
        plays = new ArrayList[T];
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            plays[i] = new ArrayList<>();
            for(int j=0; j<N; j++){
                plays[i].add(Integer.parseInt(br.readLine()));
            }
        }
    }

    private static void play(int i){
        int count = 0;
        int player = 1;
        int N = plays[i].size();
        boolean[] visited = new boolean[N+1];
        while(player!=N){
            if(visited[player]){
                System.out.println("0");
                return;
            }
            visited[player] = true;
            count++;
            player = plays[i].get(player-1);

            if(count>N){
                System.out.println("0");
                return;
            }
        }
        System.out.println(count);
    }
}
