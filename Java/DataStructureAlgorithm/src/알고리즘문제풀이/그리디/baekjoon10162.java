package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class baekjoon10162 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, A=300, B=60, C=10, min=Integer.MAX_VALUE, minA, minB, minC;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i= N/A; i>=0; i--){
            for(int j=N%A/B; j>=0; j--){
                int rest = N%A%B%C;
                if(rest == 0){
                    int k = (N-A*i-B*j)/C;
                    int cnt = i+j+k;
                    if(min>cnt){
                        min = cnt;
                        minA = i;
                        minB = j;
                        minC = k;
                    }
                }
            }
        }
        if(min != Integer.MAX_VALUE){
            System.out.printf("%d %d %d", minA, minB, minC);
        } else {
            System.out.println("-1");
        }
    }
}
