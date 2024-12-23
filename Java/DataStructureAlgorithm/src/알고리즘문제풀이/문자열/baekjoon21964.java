package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon21964 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(str.substring(N-5));
    }
}
