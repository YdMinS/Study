package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;
import java.math.*;

public class baekjoon15740 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        System.out.print(A.add(B));
    }
}
