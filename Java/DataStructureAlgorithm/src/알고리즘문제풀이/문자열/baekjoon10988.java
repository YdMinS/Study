package 알고리즘문제풀이.문자열;

import java.io.*;
import java.lang.*;

public class baekjoon10988 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
