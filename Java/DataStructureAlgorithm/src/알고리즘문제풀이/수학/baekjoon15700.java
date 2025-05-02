package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon15700 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        System.out.print(N * M / 2);
    }
}
