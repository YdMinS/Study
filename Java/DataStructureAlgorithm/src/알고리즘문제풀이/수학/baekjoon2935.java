package 알고리즘문제풀이.수학;

import java.io.*;
import java.math.BigInteger;

public class baekjoon2935 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        String operator = br.readLine();
        BigInteger b = new BigInteger(br.readLine());
        System.out.println(operator.equals("+") ? a.add(b) : a.multiply(b));
    }
}
