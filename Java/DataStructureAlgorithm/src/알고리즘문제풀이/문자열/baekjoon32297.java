package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon32297 {
    static final String GORI = "gori";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(str.contains(GORI) ? "YES" : "NO");
    }
}
