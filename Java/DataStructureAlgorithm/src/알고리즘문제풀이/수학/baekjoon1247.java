package 알고리즘문제풀이.수학;

import java.io.*;
import java.math.*;

public class baekjoon1247 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = br.readLine())!=null){
            int N = Integer.parseInt(input);
            BigInteger sum = BigInteger.ZERO;
            for(int i=0; i<N; i++){
                sum = sum.add(new BigInteger(br.readLine()));
            }
            if(sum.compareTo(BigInteger.ZERO)>0){
                System.out.println("+");
            } else if (sum.compareTo(BigInteger.ZERO)<0){
                System.out.println("-");
            } else {
                System.out.println(0);
            }
        }
    }
}
