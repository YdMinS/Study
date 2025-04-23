package 알고리즘문제풀이.수학;

import java.math.*;
import java.util.*;
import java.io.*;

public class baekjoon13277 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());
        BigDecimal c = a.multiply(b);
        System.out.print(c);
    }
}
