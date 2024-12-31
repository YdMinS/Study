package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon9933 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> wordSet = new HashSet();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            String reversedStr = new StringBuilder(str).reverse().toString();
            if(wordSet.contains(str) || reversedStr.equals(str)){
                int length = str.length();
                System.out.println(String.format("%d %c", length, str.charAt(length/2)));
                return;
            } else {
                wordSet.add(reversedStr);
            }
        }
    }
}
