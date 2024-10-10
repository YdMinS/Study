package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon5576 {
    static Integer[] A= new Integer[10], B = new Integer[10];

    public static void main(String[] args) throws IOException{
        input();
        int a=0, b=0;
        for(int i=0; i<3; i++){
            a+=A[i];
            b+=B[i];
        }
        System.out.printf("%d %d", a, b);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<10; i++){
            B[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B, Collections.reverseOrder());
    }
}
