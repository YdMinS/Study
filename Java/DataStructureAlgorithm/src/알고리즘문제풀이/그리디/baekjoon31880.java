package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon31880 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long p=0;
        for(int i=0; i<N; i++){
            p += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int m = Integer.parseInt(st.nextToken());
            if(m==0) continue;
            p *= m;
        }
        System.out.println(p);
    }
}
