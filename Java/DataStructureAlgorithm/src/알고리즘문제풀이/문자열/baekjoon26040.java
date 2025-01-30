package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon26040 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder strBuilder = new StringBuilder();
        Set<Character> charSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            char ch = st.nextToken().charAt(0);
            charSet.add(ch);
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(charSet.contains(ch)){
                char chToAppend = (char)(ch-'A'+'a');
                strBuilder.append(chToAppend);
            } else {
                strBuilder.append(ch);
            }
        }
        System.out.println(strBuilder);
    }
}
