package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon13235 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0; i<str.length()/2; i++){
            char chF = str.charAt(i);
            char chB = str.charAt(str.length()-1-i);
            if(chF!=chB){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
