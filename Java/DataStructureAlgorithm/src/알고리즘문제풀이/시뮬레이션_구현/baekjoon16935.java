package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.util.*;
import java.io.*;

public class baekjoon16935 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, calcTypeNum;
    static int[][] originMap, result;
    static int[] calcType;

    public static void main(String[] args)throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        calcTypeNum = Integer.parseInt(st.nextToken());
        originMap = new int[N][M];
        calcType = new int[calcTypeNum];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                originMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<calcTypeNum; i++){
            calcType[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute(){
        int[][] map = originMap;
        for(int i=0; i<calcTypeNum; i++){
            switch (calcType[i]){
                case 1:
                    map = calc1(map);
                    break;
                case 2:
                    map = calc2(map);
                    break;
                case 3:
                    map = calc3(map);
                    break;
                case 4:
                    map = calc4(map);
                    break;
                case 5:
                    map = calc5(map);
                    break;
                case 6:
                    map = calc6(map);
                    break;
            }
        }
        result = map;
    }

    static void output(){
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    // 1. 상하반전
    static int[][] calc1(int[][] map){
        int N = map.length;
        int M = map[0].length;
        int[][] result = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                result[N-1-i][j] = map[i][j];
            }
        }
        return result;
    }

    // 2. 좌우반전
    static int[][] calc2(int[][] map){
        int N = map.length;
        int M = map[0].length;
        int[][] result = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                result[i][M-1-j] = map[i][j];
            }
        }
        return result;
    }

    // 3. 오른쪽 90도
    static int[][] calc3(int[][] map){
        int N = map.length;
        int M = map[0].length;
        int[][] result = new int[M][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                result[j][N-1-i] = map[i][j];
            }
        }
        return result;
    }

    // 4. 왼쪽 90도
    static int[][] calc4(int[][] map){
        int N = map.length;
        int M = map[0].length;
        int[][] result = new int[M][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                result[M-1-j][i] = map[i][j];
            }
        }
        return result;
    }

    // 5. 4분면 오른쪽 90도
    static int[][] calc5(int[][] map){
        int N = map.length;
        int M = map[0].length;
        int[][] result = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int a = 0;
                int b = 0;
                if(i<N/2){
                    if(j<M/2){
                        b = 1;
                    } else {
                        a = 1;
                    }
                } else {
                    if(j<M/2){
                        a = -1;
                    } else {
                        b = -1;
                    }
                }
                result[i+N/2*a][j+M/2*b] = map[i][j];
            }
        }
        return result;
    }

    // 6. 4분면 왼쪽 90도
    static int[][] calc6(int[][] map){
        int N = map.length;
        int M = map[0].length;
        int[][] result = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int a = 0;
                int b = 0;
                if(i<N/2){
                    if(j<M/2){
                        a = 1;
                    } else {
                        b = -1;
                    }
                } else {
                    if(j<M/2){
                        b = 1;
                    } else {
                        a = -1;
                    }
                }
                result[i+N/2*a][j+M/2*b] = map[i][j];
            }
        }
        return result;
    }
}
