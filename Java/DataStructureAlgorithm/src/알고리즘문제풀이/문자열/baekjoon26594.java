package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon26594 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String message = br.readLine();
        final char REF = message.charAt(0);
        for(int i=0; i<message.length(); i++){
            char ch = message.charAt(i);
            if(REF != ch){
                System.out.println(i);
                return;
            }
        }
        System.out.println(message.length());
    }
}
