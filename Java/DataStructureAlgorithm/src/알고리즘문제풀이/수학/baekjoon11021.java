package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11021 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuilder = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            strBuilder.append("Case #"+i+": "+(a+b)+"\n");
        }
        System.out.println(strBuilder);
    }
}
