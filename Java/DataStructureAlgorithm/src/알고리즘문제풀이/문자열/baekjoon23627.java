package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon23627 {
    static final String CUTE_STR = "driip";
    static final String CUTE = "cute";
    static final String NOT_CUTE = "not cute";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.length()<CUTE_STR.length()) {
            System.out.println(NOT_CUTE);
            return;
        }
        String strComparand = str.substring(str.length()-CUTE_STR.length());
        System.out.println(strComparand.equals(CUTE_STR) ? CUTE : NOT_CUTE);
    }
}
