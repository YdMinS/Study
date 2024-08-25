package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon16931 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, cnt;
    static int[][] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        int topAndBottom = N*M*2;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==0) topAndBottom -= 2;
            }
        }
        cnt += topAndBottom;
    }

    static void execute(){
        searchVertical();
        searchHorizontal();
    }

    static void searchVertical(){
        int vCnt = 0;
        for(int i=0; i<M; i++){
            vCnt += map[0][i];
            for(int j=0; j<N; j++){
                if(j==N-1){
                    vCnt+= map[j][i];
                    continue;
                }
                int dif = map[j+1][i]-map[j][i];
                if(dif!=0){
                    vCnt += Math.abs(dif);
                }
            }
        }
        cnt += vCnt;
    }

    static void searchHorizontal(){
        int hCnt = 0;
        for(int i=0; i<N; i++){
            hCnt += map[i][0];
            for(int j=0; j<M; j++){
                if(j==M-1){
                    hCnt+= map[i][j];
                    continue;
                }
                int dif = map[i][j+1]-map[i][j];
                if(dif!=0){
                    hCnt += Math.abs(dif);
                }
            }
        }
        cnt += hCnt;
    }
}
