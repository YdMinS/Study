package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon25644 {
    static int N, maxGap=0;
    static int[] map;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        input();
        execute();
        System.out.println(maxGap);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        dp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void execute(){
        int minPrice = map[0];
        for(int i=1; i<N; i++){
           maxGap = Math.max(maxGap, map[i]-minPrice);
           minPrice = Math.min(minPrice, map[i]);
        }
    }
}
