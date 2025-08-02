package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.math.*;

public class baekjoon1834 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger sum = BigInteger.ZERO;
        for (long i=1; i<N; i++){
            long value = i * (N +1);
            sum = sum.add(BigInteger.valueOf(value));
        }
        System.out.println(sum);
    }
}
