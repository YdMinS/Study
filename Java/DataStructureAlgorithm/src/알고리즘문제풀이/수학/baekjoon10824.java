package 알고리즘문제풀이.수학;

import java.io.*;
import java.util.*;

public class baekjoon10824 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = getNumber(st.nextToken(), st.nextToken());
        long num2 = getNumber(st.nextToken(), st.nextToken());
        System.out.println(num1 + num2);
    }

    private static long getNumber(String str1, String str2){
        return Long.parseLong(str1+str2);
    }
}

