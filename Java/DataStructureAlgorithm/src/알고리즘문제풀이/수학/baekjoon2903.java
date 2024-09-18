package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;

public class baekjoon2903 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(execute(N));
    }

    private static int execute(int N){
        int n = 2;
        for(int i=0; i<N; i++){
            n += Math.pow(2, i);
        }
        return n*n;
    }
}
