package 알고리즘문제풀이.그리디;

import java.util.*;
import java.io.*;

public class baekjoon30236 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int M = Integer.parseInt(br.readLine());
            int[] a = new int[M];
            int[] b = new int[M];
            int min = 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                a[j] = Integer.parseInt(st.nextToken());
            }
            for(int j=0; j<M; j++){
                while(min==a[j]){
                    min++;
                }
                b[j] = min;
                min++;
            }
            bw.write((min-1)+(i<N-1 ? "\n" : ""));
        }
        bw.flush();
        bw.close();
    }
}
