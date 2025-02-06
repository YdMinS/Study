package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon15829 {
    private static final int r = 31;
    private static final int M = 1234567891;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long hashedStr = 0;
        long rPow = 1;
        for(int i=0; i<N; i++){
            char ch = str.charAt(i);
            long a = ch-'a'+1;
            hashedStr = (hashedStr + a * rPow) % M;
            rPow = (rPow * r) % M;
        }
        System.out.println(hashedStr);
    }
}
