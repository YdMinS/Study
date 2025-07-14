package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1357 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(rev(rev(a) + rev(b)));
    }

    private static int rev(int n){
        StringBuilder sb = new StringBuilder(n+"");
        return Integer.parseInt(sb.reverse().toString());
    }
}
