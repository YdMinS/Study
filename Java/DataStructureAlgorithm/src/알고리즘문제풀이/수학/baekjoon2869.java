package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2869 {
    static long a, b, v, d=1;

    public static void main(String[] args) throws IOException{
        input();
        if(a-b>0) {
            d += (v - a) / (a - b);
            if((v-a)%(a-b)!=0) {
                d++;
            }
        }
        System.out.println(d);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        v = Long.parseLong(st.nextToken());
    }
}
