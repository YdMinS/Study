package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon2491 {
    static int N, max;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(max);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int prev = Integer.parseInt(st.nextToken());
        int increaing = 1;
        int decreasing = 1;
        max = 1;
        for(int i=2; i<=N; i++){
            int current = Integer.parseInt(st.nextToken());
            if(current>=prev){
                increaing++;
                max = Math.max(increaing, max);
            } else {
                increaing = 1;
            }

            if(current<=prev){
                decreasing++;
                max = Math.max(decreasing, max);
            } else {
                decreasing = 1;
            }
            prev = current;
        }
    }
}
