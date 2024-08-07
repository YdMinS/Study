package 알고리즘문제풀이.브루트포스;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon6064 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder stringBuilder = new StringBuilder();
    static int[][] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        int caseNum = Integer.parseInt(br.readLine());
        map = new int[caseNum][4];
        for(int i=0; i<caseNum; i++){
            st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
            map[i][2] = Integer.parseInt(st.nextToken());
            map[i][3] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute(){
        for(int i=0; i<map.length; i++){
            int N = map[i][0];
            int M = map[i][1];
            int x = map[i][2];
            int y = map[i][3];
            stringBuilder.append(findCnt(N, M, x, y)+"\n");
        }
    }

    static int findCnt(int N, int M, int x, int y){
        long lastYear = N*M/gcd(N, M);
        x--;
        y--;
        for(int i=x; i<lastYear; i+=N) {
            if(i%M == y){
                return i+1;
            }
        }
        return -1;
    }

    static void output(){
        System.out.println(stringBuilder.toString());
    }

    static int gcd(int N, int M){
        int big, small;
        if(N>M){
            big = N;
            small = M;
        } else {
            big = M;
            small = N;
        }
        while(small != 0){
            int rest = big%small;
            big = small;
            small = rest;
        }
        return big;
    }
}