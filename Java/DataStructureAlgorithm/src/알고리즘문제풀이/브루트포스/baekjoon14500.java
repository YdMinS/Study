package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon14500 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, max;
    static int[][] map;
    static int[][][] type = {
            // I
            {{0,0},{0,1},{0,2},{0,3}},
            {{0,0},{1,0},{2,0},{3,0}},

            // O
            {{0,0},{0,1},{1,0},{1,1}},

            // L
            {{0,0},{1,0},{2,0},{2,1}},
            {{0,0},{0,1},{0,2},{1,0}},
            {{0,0},{1,0},{2,0},{0,1}},
            {{0,0},{0,1},{0,2},{-1,2}},
            {{0,0},{1,0},{1,1},{1,2}},
            {{0,0},{0,1},{0,2},{1,0}},
            {{0,0},{0,1},{1,1},{2,1}},
            {{0,0},{0,1},{1,0},{2,0}},

            // J
            {{0,0},{1,0},{2,0},{2,-1}},
            {{0,0},{0,1},{0,2},{1,2}},
            {{0,0},{1,0},{2,0},{0,-1}},
            {{0,0},{0,1},{0,2},{-1,2}},
            {{0,0},{1,0},{1,1},{1,2}},
            {{0,0},{0,1},{0,2},{1,0}},
            {{0,0},{0,1},{1,1},{2,1}},
            {{0,0},{0,1},{1,0},{2,0}},

            // S
            {{0,0},{1,0},{1,1},{2,1}},
            {{0,0},{0,1},{-1,1},{-1,2}},
            {{0,0},{1,0},{1,-1},{2,-1}},
            {{0,0},{0,1},{1,1},{1,2}},

            // Z
            {{0,0},{1,0},{1,-1},{2,-1}},
            {{0,0},{0,1},{1,1},{1,2}},
            {{0,0},{1,0},{1,1},{2,1}},
            {{0,0},{0,1},{-1,1},{-1,2}},

            // T
            {{0,0},{0,1},{0,2},{1,1}},
            {{0,0},{1,0},{2,0},{1,1}},
            {{0,0},{0,1},{0,2},{-1,1}},
            {{0,0},{1,0},{2,0},{1,-1}},
    };

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(max);
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void execute() {
        for(int j=0; j<N; j++){
            for(int k=0; k<M; k++){
                for(int i=0; i<type.length; i++){
                    boolean isValid = true;
                    int calculatedValue = 0;
                    for(int l=0; l<4; l++){
                        int x = j + type[i][l][0];
                        int y = k + type[i][l][1];
                        if(x<0 || y<0 || x>N-1 || y>M-1) {
                            isValid = false;
                            break;
                        }
                        calculatedValue += map[x][y];
                    }
                    if(isValid && calculatedValue > max){
                        max = calculatedValue;
                    }
                }
            }
        }
    }
}
