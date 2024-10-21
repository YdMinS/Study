package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class baekjoon25176 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 1;
        if(N==1){
            System.out.println(result);
            return;
        }
        for(int i=2; i<=N; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
