package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon11050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long result = 1;
        for(int i=N; i>N-K; i--){
            result *= i;
        }
        for(int i=1; i<=K; i++){
            result /= i;
        }
        System.out.println(result);
    }
}
