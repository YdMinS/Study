package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;
import java.math.*;

public class baekjoon10826 {
    static int N;
    static BigInteger[] fibonacci;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(fibonacci[N]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fibonacci = new BigInteger[Math.max(N+1, 2)];
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;
    }

    private static void execute(){
        if(N<2) return;
        for(int i=2; i<=N; i++){
            fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
        }
    }
}
