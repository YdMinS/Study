package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon20494 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            result += str.length();
        }
        System.out.print(result);
    }
}
