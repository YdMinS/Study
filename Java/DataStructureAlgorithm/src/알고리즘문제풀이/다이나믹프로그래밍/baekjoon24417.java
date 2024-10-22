package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon24417 {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int recursiveCNT = fibonacciR(N);
        int dynamicCNT = fibonacciD(N);
        System.out.printf("%d %d", recursiveCNT, dynamicCNT);
    }

    private static int fibonacciR(int N){
        if(N==1) return 1;
        if(N==2) return 1;
        int prev =1;
        int current = 1;
        int temp;
        for(int i=3; i<=N; i++){
            temp = current;
            current = (current + prev) % MOD ;
            prev = temp;
        }
        return current;
    }

    private static int fibonacciD(int N){
        if(N==1) return 1;
        if(N==2) return 1;
        return (N-2)%MOD;
    }
}
