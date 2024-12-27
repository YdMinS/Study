package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon10039 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i=0; i<5; i++){
            int num = Integer.parseInt(br.readLine());
            sum += num>=40 ? num/5 : 8;
        }
        System.out.println(sum);
    }
}
