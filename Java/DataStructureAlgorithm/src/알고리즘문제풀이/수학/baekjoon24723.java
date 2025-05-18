package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon24723 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2, N));
    }
}
