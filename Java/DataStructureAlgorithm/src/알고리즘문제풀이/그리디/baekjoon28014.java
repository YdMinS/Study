package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon28014 {
    static int N, cnt=1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int last;
        StringTokenizer st = new StringTokenizer(br.readLine());
        last = Integer.parseInt(st.nextToken());
        for(int i=1; i<N; i++){
            int current = Integer.parseInt(st.nextToken());
            if(current>=last){
                cnt++;
            }
            last = current;
        }
        System.out.println(cnt);
    }
}
