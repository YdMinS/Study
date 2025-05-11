package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon16430 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(B-A+" "+B);
    }
}
