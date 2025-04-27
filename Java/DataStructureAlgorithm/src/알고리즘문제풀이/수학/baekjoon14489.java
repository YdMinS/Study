package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon14489 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum = A + B;
        int chickPrice = Integer.parseInt(br.readLine());
        if(sum >= chickPrice * 2){
            System.out.print(sum - chickPrice * 2);
        } else {
            System.out.print(sum);
        }
    }
}
