package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.lang.*;

public class baekjoon16926 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder stringBuilder = new StringBuilder();
    static int N, M, count;
    static int[][] map, result;

    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        input();
        System.out.println("input: "+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        execute();
        System.out.println("execute: "+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        output();
        System.out.println("output: "+(System.currentTimeMillis()-start));
    }

    static void input() throws IOException{
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        count = Integer.parseInt(input[2]);
        map = new int[N][M];
        for(int i=0; i<N; i++){
            input = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }
    }

    static void execute() {
        result = map;
        for(int i=0; i<count; i++){
            result = rotate();
        }
    }

    static int[][] rotate(){
        int[][] tempMap = new int[N][M];
        for(int i=0; i<Math.min(N, M)/2; i++){
            int x=i, y=i;
            int mx = N-1-i, my = M-1-i;
            tempMap[x][y] = result[x][y+1];
            tempMap[mx][y] = result[mx-1][y];
            tempMap[mx][my] = result[mx][my-1];
            tempMap[x][my] = result[x+1][my];
            for(int j=i+1; j<=mx-1; j++){
                tempMap[j][y] = result[j-1][y];
                tempMap[j][my] = result[j+1][my];
            }
            for(int j=i+1; j<=my-1; j++){
                tempMap[x][j] = result[x][j+1];
                tempMap[mx][j] = result[mx][j-1];
            }
        }
        return tempMap;
    }

    static void output(){
        for(int[] row: result){
           for(int value: row){
               stringBuilder.append(value).append(" ");
           }
           stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
