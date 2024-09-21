package 알고리즘문제풀이.빅오;

import java.lang.*;
import java.io.*;
import java.math.*;

public class baekjoon24267 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger result = new BigInteger("0");
        if(N>=3){
            BigInteger nextTerm = new BigInteger("0");
            for(int i=3; i<=N; i++){
                nextTerm = nextTerm.add(new BigInteger(i-2+""));
                result = result.add(nextTerm);
            }
        }
        System.out.println(result+"\n"+3);
    }
}
