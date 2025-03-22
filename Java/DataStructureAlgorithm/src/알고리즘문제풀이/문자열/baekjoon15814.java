package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon15814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            char temp = S[a];
            S[a] = S[b];
            S[b] = temp;
        }
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<S.length; i++){
            strBuilder.append(S[i]);
        }
        System.out.print(strBuilder);
    }
}
