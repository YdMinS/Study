package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon11943 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        a += Integer.parseInt(st.nextToken());
        b += Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        b += Integer.parseInt(st.nextToken());
        a += Integer.parseInt(st.nextToken());
        System.out.print(Math.min(a, b));
    }
}
