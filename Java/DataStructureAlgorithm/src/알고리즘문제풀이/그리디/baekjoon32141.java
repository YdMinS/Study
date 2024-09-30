package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon32141 {

    public static void main(String[] arsg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int current = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            current += Integer.parseInt(st.nextToken());
            if(current>=M){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
}
