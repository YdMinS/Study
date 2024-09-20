package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon5086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0) return;
            if(a>b){
                if(a%b==0) {
                    System.out.println("multiple");
                    continue;
                }
            }
            if(a<b){
                if(b%a==0) {
                    System.out.println("factor");
                    continue;
                }
            }
            System.out.println("neither");
        }
    }
}
