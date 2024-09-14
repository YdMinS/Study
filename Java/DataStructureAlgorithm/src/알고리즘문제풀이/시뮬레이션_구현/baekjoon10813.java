package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon10813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuilder = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] map = new int[N+1];
        for(int i=1; i<=N; i++){
            map[i] = i;
        }
        for(int i=0; i<C; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = map[a];
            map[a] = map[b];
            map[b] = temp;
        }
        for(int i=1; i<=N; i++){
            strBuilder.append(map[i]);
            if(i<N){
                strBuilder.append(" ");
            }
        }
        System.out.println(strBuilder);
    }
}
