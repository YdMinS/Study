package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon2154 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pattern = br.readLine();
        int N = Integer.parseInt(pattern);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1; i<=N; i++){
            stringBuilder.append(i);
        }
        for(int i=0; i<=stringBuilder.length()-pattern.length(); i++){
            String str = stringBuilder.substring(i, i+pattern.length());
            if(str.equals(pattern)) {
                System.out.println(i+1);
                return;
            }
        }
    }
}
