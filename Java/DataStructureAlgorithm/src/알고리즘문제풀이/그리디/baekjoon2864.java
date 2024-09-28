package 알고리즘문제풀이.그리디;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon2864 {
    static String a, b;
    static long min, max;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(min+" "+max);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = st.nextToken();
        b = st.nextToken();
        long minA, maxA, minB, maxB;
        if(a.contains("5")){
            maxA = Long.parseLong(a.replaceAll("5", "6"));
        } else {
            maxA = Long.parseLong(a);
        }
        if(a.contains("6")){
            minA = Long.parseLong(a.replaceAll("6", "5"));
        } else {
            minA = Long.parseLong(a);
        }
        if(b.contains("5")){
            maxB = Long.parseLong(b.replaceAll("5", "6"));
        } else {
            maxB = Long.parseLong(b);
        }
        if(b.contains("6")){
            minB = Long.parseLong(b.replaceAll("6", "5"));
        } else {
            minB = Long.parseLong(b);
        }
        min = minA + minB;
        max = maxA + maxB;
    }
}
