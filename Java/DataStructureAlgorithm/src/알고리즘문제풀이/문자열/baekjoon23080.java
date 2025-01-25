package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon23080 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuilder = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i=0; i<str.length(); i+=N){
            strBuilder.append(str.charAt(i));
        }
        System.out.println(strBuilder);
    }
}
