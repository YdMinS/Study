package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.io.*;

public class baekjoon9507 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, cursor = 0;
    static int[] map;
    static long[] koong;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        koong = new long[70];
        map = new int[N];
        koong[0] = 1;
        koong[1] = 1;
        koong[2] = 2;
        koong[3] = 4;
        cursor = 4;
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
        br.close();
    }

    private static void execute() throws IOException{
        for(int i=0; i<N; i++){
            int operand = map[i];
            if(operand>=cursor){
                while(cursor<=operand){
                    koong[cursor] = koong[cursor-1] + koong[cursor-2] + koong[cursor-3] + koong[cursor-4];
                    cursor++;
                }
            }
            bw.write(koong[operand]+"\n");
        }
    }
}
