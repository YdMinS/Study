package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;

public class baekjoon25314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuilder = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int num = N%4==0 ? N/4 : N/4+1;
        for(int i=0; i<num; i++){
            strBuilder.append("long ");
        }
        strBuilder.append("int");
        System.out.println(strBuilder);
    }
}
