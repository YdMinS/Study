package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.lang.*;

public class baekjoon16927 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder strBuilder = new StringBuilder();
    static int N, M, R;
    static int[][] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        R = Integer.parseInt(input[2]);
        map = new int[N][M];
        for(int i=0; i<N; i++){
            input = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }
    }

    static void execute() {
        int layers = Math.min(N, M)/2;
        for(int i=0; i<layers; i++){
            rotate(i);
        }
    }

    static void rotate(int layer){
        int height = N - 2 * layer;
        int width = M - 2 * layer;
        int r = R % (2 * (height + width -2));

        for(int i=0; i<r; i++){
            int temp = map[layer][layer];

            for(int j=layer; j<M-1-layer; j++){
                map[layer][j] = map[layer][j+1];
            }
            for(int j=layer; j<N-1-layer; j++){
                map[j][M-1-layer] = map[j+1][M-1-layer];
            }
            for(int j=M-1-layer; j>layer; j--){
                map[N-1-layer][j] = map[N-1-layer][j-1];
            }
            for(int j=N-1-layer; j>layer+1; j--){
                map[j][layer] = map[j-1][layer];
            }
            map[layer+1][layer] = temp;
        }
    }

    static void output(){
        for(int[] row: map){
            for(int value: row){
                strBuilder.append(value).append(" ");
            }
            strBuilder.append("\n");
        }
        System.out.println(strBuilder.toString());
    }
}