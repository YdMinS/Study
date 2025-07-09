package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon10707 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        int priceA = P * A;
        int priceB = B + (P>C ? (P-C)*D : 0);
        System.out.println(Math.min(priceA, priceB));
    }
}
