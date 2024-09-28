package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon13301 {
    static int N;
    static long[] fibonacci;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println((fibonacci[N]+fibonacci[N-1])*2);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fibonacci = new long[Math.max(N+1, 2)];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
    }

    private static void execute() {
        if(N<2) return;
        for(int i=2; i<=N; i++){
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }

    }
}
