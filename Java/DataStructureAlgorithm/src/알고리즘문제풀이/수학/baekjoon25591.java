package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon25591 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int a = 100 - Integer.parseInt(A);
        int b = 100 - Integer.parseInt(B);
        int c = 100 - a - b;
        int d = a * b;
        int q = d / 100;
        int r = d % 100;
        System.out.printf("%d %d %d %d %d %d\n", a, b, c, d, q, r);
        c += q;
        d = r;
        System.out.printf("%d %d", c, d);
    }
}
