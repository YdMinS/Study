package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon16967 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int H, W, X, Y;
    static int[][] A, B;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        A = new int[H][W];
        B = new int[H+X][W+Y];
        for(int i=0; i<H+X; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<W+Y; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void execute() {
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                A[i][j] = B[i][j];
            }
        }
        if(H==X || Y==W) return;
        for(int i=X; i<H; i++){
            for(int j=Y; j<W; j++){
                A[i][j] = A[i][j]-A[i-X][j-Y];
            }
        }
    }

    private static void output(){
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                strBuilder.append(A[i][j]+" ");
            }
            strBuilder.append("\n");
        }
        System.out.println(strBuilder);
    }
}
