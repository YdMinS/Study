package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon2010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long max = Integer.parseInt(br.readLine());
        for(int i=1; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            max += num-1;
        }
        System.out.println(max);
    }
}
