package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon12780 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String H = br.readLine();
        String pattern = br.readLine();
        int result = 0;
        for(int i=0; i<=H.length()-pattern.length(); i++){
            String test = H.substring(i, i+pattern.length());
            if(test.equals(pattern)) result++;
        }
        System.out.println(result);
    }
}
