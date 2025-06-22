package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon20327 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder strBuilder = new StringBuilder();
    static StringTokenizer st;
    static int N, R, length;
    static int[][] map;
    static int[] L, K;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        length = (int)Math.pow(2,N);
        map = new int[length][length];
        L = new int[R];
        K = new int[R];
        for(int i=0; i<length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<length; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<R; i++){
            st = new StringTokenizer(br.readLine());
            K[i] = Integer.parseInt(st.nextToken());
            L[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void output() {
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                strBuilder.append(map[i][j]+" ");
            }
            strBuilder.append("\n");
        }
        System.out.println(strBuilder);
    }

    private static void execute(){
        for(int i=0; i<R; i++){
            int k = K[i];
            int l = L[i];
            if(k<5){
                unitPlay(k, l);
            } else {
                blockPlay(k, l);
            }
        }
    }

    private static void unitPlay(int k, int l){
        for(int i=0; i<Math.pow(2,l); i++){
            for(int j=0; j<Math.pow(2,l); j++){
                int startX = length/(int)Math.pow(2,l)*i;
                int endX = length/(int)Math.pow(2,l)*(i+1);
                int startY = length/(int)Math.pow(2,l)*j;
                int endY = length/(int)Math.pow(2,l)*(j+1);
                switch(k){
                    case 1:
                        r1(startX, endX, startY, endY);
                        break;
                    case 2:
                        r2(startX, endX, startY, endY);
                        break;
                    case 3:
                        r3(startX, endX, startY, endY);
                        break;
                    case 4:
                        r4(startX, endX, startY, endY);
                }
            }
        }

    }

    private static void blockPlay(int k, int l){
        switch(k){
            case 5:
                r5(l);
                break;
            case 6:
                r6(l);
                break;
            case 7:
                r7(l);
                break;
            case 8:
                r8(l);
        }
    }

    private static void r1(int startX, int endX, int startY, int endY){
        int length = endX-startX;
        for(int i=0; i<length/2; i++){
            for(int j=0; j<length; j++){
                int temp = map[startX+i][startY+j];
                map[startX+i][startY+j] = map[endX-1-i][startY+j];
                map[endX-1-i][startY+j] = temp;
            }
        }
    }

    private static void r2(int startX, int endX, int startY, int endY){
        int length = endX-startX;
        for(int i=0; i<length; i++){
            for(int j=0; j<length/2; j++){
                int temp = map[startX+i][startY+j];
                map[startX+i][startY+j] = map[startX+i][endY-1-j];
                map[startX+i][endY-1-j] = temp;
            }
        }
    }

    private static void r3(int startX, int endX, int startY, int endY){
        int length = endX-startX;
        for(int i=0; i<length/2; i++){

        }
    }

    private static void r4(int startX, int endX, int startY, int endY){

    }

    private static void r5(int l){

    }

    private static void r6(int l){

    }

    private static void r7(int l){

    }

    private static void r8(int l){

    }

    private static void r9(int l){

    }
}
