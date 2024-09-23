package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon1018 {
    static int N, M, min = 64;
    static char[][] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(min);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j);
            }
        }
    }

    private static void execute(){
        int a = N-8+1;
        int b = M-8+1;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                count(i, j);
            }
        }
    }

    private static void count(int x, int y){
        int flippedW = 0;
        int flippedB = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                int num = i + j;
                if (num % 2 == 1) {
                    if(map[i][j] != 'W') flippedW++;
                    if(map[i][j] != 'B') flippedB++;
                } else {
                    if(map[i][j] !='B') flippedW++;
                    if(map[i][j] !='W') flippedB++;
                }
            }
        }
        min = Math.min(Math.min(flippedW, flippedB), min);
    }
}
