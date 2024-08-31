package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjonn13136 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long R = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        long verticalN = R % N == 0 ? R/N : R/N+1;
        long horizontalN = C % N ==0 ? C/N : C/N+1;
        System.out.println(verticalN*horizontalN);
    }
}
