package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon10103 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = 100, B = 100;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a>b){
                B -= a;
            } else if (a<b){
                A -= b;
            }
        }
        System.out.printf("%d\n%d", A, B);
    }
}
