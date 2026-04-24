package 알고리즘문제풀이.재귀;

import java.io.*;

public class baekjoon2447 {
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        map[0][0] = 1;

        if (N>=3) init();

        for(int i=9; i<=N; i=i*3) {
            buildPattern(i);
        }

        for (int[] chars : map) {
            for (int j = 0; j < map.length; j++) {
                bw.write(chars[j]==1 ? "*" : " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void init() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if (i==1 && j==1) continue;
                map[i][j] = 1;
            }
        }
    }

    private static void buildPattern(int size) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (i == 1 && j == 1) continue;
                buildPatternPart(size, i, j);
            }
        }
    }


    private static void buildPatternPart(int size, int blockIndexI, int blockIndexJ) {
        int offset = size/3;
        for(int i=0; i<offset; i++) {
            for(int j=0; j<offset; j++) {
                map[i+offset*blockIndexI][j+offset*blockIndexJ] = map[i][j];
            }
        }
    }
}
