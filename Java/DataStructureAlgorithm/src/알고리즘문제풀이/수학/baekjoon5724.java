package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon5724 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int result = 0;
            for(int i=1; i<=n; i++){
                result += i*i;
            }
            System.out.println(result);
        }
    }
}
