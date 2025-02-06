package 알고리즘문제풀이.문자열;

import java.math.*;
import java.io.*;

public class baekjoon1212 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num = new BigInteger(br.readLine(), 8);
        System.out.println(num.toString(2));
    }
}
