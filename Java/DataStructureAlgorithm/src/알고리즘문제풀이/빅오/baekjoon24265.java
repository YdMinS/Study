package 알고리즘문제풀이.빅오;

import java.lang.*;
import java.io.*;

public class baekjoon24265 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;
        for(int i=1; i<=N-1; i++){
            sum += (N-i);
        }
        System.out.println(sum+"\n"+2);
    }
}
