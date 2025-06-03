package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon28097 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = 0;
        int[] timeTable = new int[N];
        for(int i=0; i<N; i++){
            timeTable[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            time += timeTable[i];
            if(i!=0) time += 8;
        }
        System.out.printf("%d %d", time/24, time%24);
    }
}
