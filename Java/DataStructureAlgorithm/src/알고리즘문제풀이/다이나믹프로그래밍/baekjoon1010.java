package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.*;

public class baekjoon1010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 || b==0){
                stringBuilder.append("0\n");
            } else {
                stringBuilder.append(calculate(a, b)+"\n");
            }
        }
        System.out.println(stringBuilder);
    }

    private static BigInteger calculate(int a, int b){
        BigInteger result = new BigInteger("1");
        BigInteger n = new BigInteger("1");
        for(int i=1; i<=a; i++){
            result = result.multiply(new BigInteger(b+1-i+""));
            n = n.multiply(new BigInteger(i+""));
        }
        return result.divide(n);
    }
}
