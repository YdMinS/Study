package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon1676 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numOf2 = 0;
        int numOf5 = 0;
        for(int i=2; i<=N; i*=2){
            numOf2 += N/i;
        }
        for(int i=5; i<=N; i*=5){
            numOf5 += N/i;
        }
        System.out.println(Math.min(numOf2, numOf5));
    }
}