package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon23303 {
    static final String SMALL_D2 = "d2";
    static final String D2 = "D2";
    static final String UNRATED = "unrated";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.contains(SMALL_D2) || str.contains(D2)){
                System.out.println(D2);
                return;
            }
        }
        System.out.println(UNRATED);
    }
}
