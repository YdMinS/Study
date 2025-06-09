package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon2921 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(findDotNumber(N));
    }

    private static long findDotNumber(int N){
        long result = 0;
        for(int i=0; i<=N; i++){
            for(int j=0; j<=i; j++){
                result += (i+j);
            }
        }
        return result;
    }
}
