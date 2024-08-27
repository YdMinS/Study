package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon1080 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, cnt=0;
    static int[][] map, refMap;

    public static void main(String[] args) throws IOException{
        input();
        if(cnt!=-1) {
            execute();
        }
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        refMap = new int[N][M];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++){
                refMap[i][j] = str.charAt(j) - '0';
            }
        }
    }

    private static void execute(){
        if(N>2 && M>2) {
            for (int i = 0; i < N - 2; i++) {
                for (int j = 0; j < M - 2; j++) {
                    if (map[i][j] != refMap[i][j]) {
                        flipper(i, j);
                        cnt++;
                    }
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]!=refMap[i][j]){
                    cnt=-1;
                    return;
                }
            }
        }
    }

    private static void flipper(int x, int y){
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                map[i][j] = map[i][j]==0 ? 1 : 0;
            }
        }
    }
}
