package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon27959 {
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()) * 100;
        int M = Integer.parseInt(st.nextToken());
        System.out.print(N>=M ? YES : NO);
    }
}
