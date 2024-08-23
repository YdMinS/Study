package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.math.*;

public class baekjoon1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" ");
        BigInteger money = new BigInteger(list[0]);
        BigInteger n = new BigInteger(list[1]);
        BigInteger[] result = money.divideAndRemainder(n);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
