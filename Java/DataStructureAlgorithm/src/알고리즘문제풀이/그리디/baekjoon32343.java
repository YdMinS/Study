package 알고리즘문제풀이.그리디;

import java.math.*;
import java.util.*;
import java.io.*;

public class baekjoon32343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int one = a + b > N ? N - (a + b - N) : a + b;
        int zero = N - one;
        String toCalculate = "0".repeat(zero) + "1".repeat(one);
        BigInteger result = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        for(int i=0; i<toCalculate.length(); i++){
            if(toCalculate.charAt(i)=='1') {
                result = result.add(two.pow(i));
            }
        }
        System.out.println(result);
    }
}
