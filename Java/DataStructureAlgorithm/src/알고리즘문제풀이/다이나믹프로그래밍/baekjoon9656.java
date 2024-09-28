package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon9656 {
    static int N;
    static String winner;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(winner);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    private static void execute(){
        if(N%2==0){
            winner = "SK";
        } else {
            winner = "CY";
        }
    }
}
