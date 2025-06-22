package 알고리즘문제풀이.그리디;

import java.io.*;
import java.lang.*;

public class baekjoon21313 {
    static int N;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N+1];
        map[1] = 1;
    }

    private static void execute(){
        for(int i=2; i<=N; i++){
            if(i<N){
                if(map[i-1]==1){
                    map[i] = 2;
                } else {
                    map[i] = 1;
                }
            } else {
                if(map[i-1]==1){
                    map[i] = 2;
                } else {
                    map[i] = 3;
                }
            }
        }
    }

    private static void output(){
        StringBuilder strBuilder = new StringBuilder();
        for(int i=1; i<=N; i++){
            strBuilder.append(map[i]);
            if(i==map.length) continue;
            strBuilder.append(" ");
        }
        System.out.println(strBuilder);
    }
}
