package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon23795 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int sum = 0;
        while((num = Integer.parseInt(br.readLine()))!=-1){
            sum += num;
        }
        System.out.print(sum);
    }
}
