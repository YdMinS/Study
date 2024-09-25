package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon30018 {
    static int N, cnt=0;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stA, stB;
        N = Integer.parseInt(br.readLine());
        stA = new StringTokenizer(br.readLine());
        stB = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(stA.nextToken());
            int b = Integer.parseInt(stB.nextToken());
            int c = a-b;
            if(c>0) cnt+=c;
        }
    }
}
