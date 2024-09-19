package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;

public class baekjoon1193 {
    static int N, level, rest;

    public static void main(String[] args) throws IOException{
        input();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        level = 1;
        int num = 1;
        while(N>num){
            level++;
            num += level;
        }
        rest = (level)+N-num;
    }

    private static void output(){
        if (level % 2 == 1) {
            System.out.println((level+1-rest)+"/"+rest);
        } else {
            System.out.println(rest+"/"+(level+1-rest));

        }
    }
}
