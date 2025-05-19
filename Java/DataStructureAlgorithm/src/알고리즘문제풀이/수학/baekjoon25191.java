package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon25191 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken()) / 2;
        int beer = Integer.parseInt(st.nextToken());
        int possibleChicken = coke + beer;
        System.out.println(Math.min(N, possibleChicken));
    }
}
