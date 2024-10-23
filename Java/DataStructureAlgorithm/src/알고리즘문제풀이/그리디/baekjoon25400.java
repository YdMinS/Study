package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon25400 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int current = 1;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == current){
                current++;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
