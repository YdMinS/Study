package 알고리즘문제풀이.수학;

import java.io.*;
import java.math.*;

public class baekjoon27434 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==0) {
            System.out.print(1);
            return;
        }
        System.out.println(factorial(1, N));
    }

    private static BigInteger factorial(int start, int end){
        if(start == end) return BigInteger.valueOf(end);

        return factorial(start, (start + end)/2).multiply(factorial((start + end)/2 + 1, end));
    }
}
