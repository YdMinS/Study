package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon22864 {
    static int A, B, C, M, burden=0, time;


    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(time*B);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    private static void execute(){
        for(int i=0; i<24; i++){
            if(burden+A<=M){
                burden+=A;
                time++;
            } else {
                burden-=C;
            }
        }
    }
}
