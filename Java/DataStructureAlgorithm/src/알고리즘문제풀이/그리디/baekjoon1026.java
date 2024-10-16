package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1026 {
    static int N;
    static Integer[] A, B;

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1, st2;
        N = Integer.parseInt(br.readLine());
        A = new Integer[N];
        B = new Integer[N];
        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st1.nextToken());
            B[i] = Integer.parseInt(st2.nextToken());
        }
    }

    private static void execute(){
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += A[i]*B[i];
        }
        System.out.println(sum);
    }
}
