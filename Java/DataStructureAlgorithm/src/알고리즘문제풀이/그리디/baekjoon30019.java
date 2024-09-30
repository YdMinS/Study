package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon30019 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    private static void execute() throws IOException{
        StringBuilder strBuilder = new StringBuilder();
        int[] endTimes = new int[N+1];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            if(from >= endTimes[n]){
                strBuilder.append("YES\n");
                endTimes[n] = to;
            } else {
                strBuilder.append("NO\n");
            }
        }
        System.out.println(strBuilder);
    }
}
