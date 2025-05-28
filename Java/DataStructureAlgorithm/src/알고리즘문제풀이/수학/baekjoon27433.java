package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon27433 {
    public static void main(String[] arsg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==0 || N==1) {
            System.out.print(1);
            return;
        }
        long result = 1;
        for(int i=2; i<=N; i++){
            result *= i;
        }
        System.out.print(result);
    }
}
