package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon1285 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[][] map;
    static Stack stack = new Stack();

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                char ch = line.charAt(j);
                if(ch == 'H'){
                    map[i][j] = 0;
                } else {
                    map[i][j] = 1;
                }
            }
        }
    }

    private static void execute(){
        calculateLine();
        while(!stack.isEmpty()){

            calculateLine();
        }
    }

    private static void calculateLine(){
        for(int i=0; i<N; i++){
            int H = 0;
            int T = 0;
            for(int j=0; j<N; j++){
                if(map[i][j]==0){
                    H++;
                } else {
                    T++;
                }
            }
            if(T>H){
                stack.push("h"+i);
            }
        }
        for(int i=0; i<N; i++){
            int H = 0;
            int T = 0;
            for(int j=0; j<N; j++){
                if(map[j][i]==0){
                    H++;
                } else {
                    T++;
                }
            }
            if(T>H){
                stack.push("v"+i);
            }
        }
    }
}
