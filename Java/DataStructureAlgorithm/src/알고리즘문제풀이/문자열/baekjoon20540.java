package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon20540 {
    static final Map<Character, String> MBTI = new HashMap<>();
    static {
        MBTI.put('I', "E");
        MBTI.put('E', "I");
        MBTI.put('S', "N");
        MBTI.put('N', "S");
        MBTI.put('T', "F");
        MBTI.put('F', "T");
        MBTI.put('J', "P");
        MBTI.put('P', "J");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myMBTI = br.readLine();
        StringBuilder yourMBTI = new StringBuilder();
        for(int i=0; i<myMBTI.length(); i++){
            yourMBTI.append(MBTI.get(myMBTI.charAt(i)));
        }
        System.out.println(yourMBTI);
    }
}
