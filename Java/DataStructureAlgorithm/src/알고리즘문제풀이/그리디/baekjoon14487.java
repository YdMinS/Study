package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon14487 {
    static int N, sum=0, min=Integer.MAX_VALUE;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(min);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
            sum += map[i];
        }
    }

    private static void execute(){
        for(int i : map){
            min = Math.min(min, sum-i);
        }
    }
}
