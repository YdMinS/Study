package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon32288 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder st = new StringBuilder(N);
        for(int i=0; i<N; i++){
            char ch = str.charAt(i);
            st.append(ch=='I' ? "i" : "L");
        }
        System.out.println(st);
    }
}
