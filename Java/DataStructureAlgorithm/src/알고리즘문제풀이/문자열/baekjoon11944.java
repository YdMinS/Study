package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon11944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int n = Integer.parseInt(N);
        int M = Integer.parseInt(st.nextToken());
        if(n*N.length() <= M){
            System.out.println(N.repeat(n));
        } else {
            String result = N.repeat(M/N.length() + 1);
            System.out.println(result.substring(0, M));
        }
    }
}
