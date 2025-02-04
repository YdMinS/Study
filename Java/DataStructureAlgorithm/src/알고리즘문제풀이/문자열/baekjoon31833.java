package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31833 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long A = Long.parseLong(br.readLine().replace(" ", ""));
        long B = Long.parseLong(br.readLine().replace(" ", ""));
        System.out.println(Math.min(A, B));
    }
}
