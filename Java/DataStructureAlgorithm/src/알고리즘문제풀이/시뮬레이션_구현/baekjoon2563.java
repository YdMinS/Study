package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2563 {
    static int N, area = 0;
    static int[][] play;
    static boolean[][] map = new boolean[101][101];

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(area);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        play = new int[N][2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            play[i][0] = Integer.parseInt(st.nextToken());
            play[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    private static void execute(){
        for(int i=0; i<N; i++){
            int a = play[i][0];
            int b = play[i][1];
            for(int x=a; x<a+10; x++){
                for(int y=b; y<b+10; y++){
                    if(!map[x][y]){
                        map[x][y] = true;
                        area++;
                    }
                }
            }
        }
    }
}