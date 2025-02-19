package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon1871 {
    private static final String NICE = "nice";
    private static final String NOT_NICE = "not nice";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine().replace("-", " "));
            String frontStr = st.nextToken();
            int front = 0;
            int back = Integer.parseInt(st.nextToken());
            for(int j=0; j<frontStr.length(); j++){
                int num = frontStr.charAt(j)-'A';
                front += num * (int)Math.pow(26, frontStr.length()-1-j);
            }

            bw.write((Math.abs(front - back) <= 100 ? NICE : NOT_NICE)+(i<N-1 ? "\n" : ""));
        }
        bw.close();
    }
}
