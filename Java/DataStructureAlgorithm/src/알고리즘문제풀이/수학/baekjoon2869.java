package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long v = Long.parseLong(st.nextToken());
        long d = 1+ (v-a) / (a-b);
        if((v-a)%(a-b)!=0) d++;
        System.out.println(d);
    }
}
