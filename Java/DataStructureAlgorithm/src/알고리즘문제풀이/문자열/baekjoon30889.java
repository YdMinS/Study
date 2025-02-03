package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon30889 {
    static char[][] seatMap = new char[10][20];
    static {
        for(int i=0; i<10; i++){
            Arrays.fill(seatMap[i], '.');
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String seatInfo = br.readLine();
            int n = seatInfo.charAt(0) - 'A';
            int m = Integer.parseInt(seatInfo.substring(1))-1;
            seatMap[n][m] = 'o';
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++){
                bw.write(seatMap[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
