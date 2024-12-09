package 알고리즘문제풀이.그리디;

import java.util.*;
import java.io.*;

public class baekjoon28063 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int cnt = 4;
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if(x-1==0){
            cnt--;
        }
        if(N-x==0){
            cnt--;
        }
        if(y-1==0){
            cnt--;
        }
        if(N-y==0){
            cnt--;
        }
        System.out.println(cnt);
    }
}
