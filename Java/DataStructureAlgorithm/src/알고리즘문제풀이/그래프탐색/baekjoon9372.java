package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon9372 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T, N, M, cnt;

    public static void main(String[] args) throws IOException{
        T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            input();
            System.out.println(cnt);
        }
    }

    private static void input() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cnt = N-1;
        for(int i=1; i<=M; i++){
            br.readLine();
        }
    }
}
