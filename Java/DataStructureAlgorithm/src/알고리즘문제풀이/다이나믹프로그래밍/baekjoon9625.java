package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon9625 {
    static int N;
    static int[] A, B;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(A[N]+" "+B[N]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N+1];
        B = new int[N+1];
        A[0] = 1;
        B[0] = 0;
    }

    private static void execute() {
        for(int i=1; i<=N; i++){
            A[i] = B[i-1];
            B[i] = A[i-1] + B[i-1];
        }
    }
}
