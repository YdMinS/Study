package 알고리즘문제풀이.빅오;

import java.lang.*;
import java.io.*;
import java.math.*;

public class baekjoon24266 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        System.out.println(N.pow(3)+"\n"+3);
    }
}
