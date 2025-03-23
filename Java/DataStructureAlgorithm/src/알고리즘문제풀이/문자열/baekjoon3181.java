package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon3181 {
    private static Set<String> importantPattern = new HashSet<>();
    static{
        importantPattern.add("i");
        importantPattern.add("pa");
        importantPattern.add("te");
        importantPattern.add("ni");
        importantPattern.add("niti");
        importantPattern.add("a");
        importantPattern.add("ali");
        importantPattern.add("nego");
        importantPattern.add("no");
        importantPattern.add("ili");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder strBuilder = new StringBuilder();
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(strBuilder.isEmpty() || !importantPattern.contains(token)) {
                strBuilder.append(getUpperFirstChar(token));
            }

        }
        System.out.print(strBuilder);
    }

    private static char getUpperFirstChar(String word){
        return Character.toUpperCase(word.charAt(0));
    }
}
