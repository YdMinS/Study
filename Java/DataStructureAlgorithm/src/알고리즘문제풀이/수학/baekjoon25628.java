package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon25628 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken()) / 2;
        int p = Integer.parseInt(st.nextToken());
        System.out.print(Math.min(b, p));
    }
}
