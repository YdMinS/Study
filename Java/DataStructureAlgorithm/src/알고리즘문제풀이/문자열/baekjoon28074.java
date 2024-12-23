package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon28074 {
    static final String REF = "MOBIS";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set<Character> charSet = new HashSet();
        for(int i=0; i<str.length(); i++){
            charSet.add(str.charAt(i));
        }
        for(int i=0; i<REF.length(); i++){
            if(!charSet.contains(REF.charAt(i))){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
