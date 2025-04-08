package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon29713 {
    private static final String BRONZESILVER = "BRONZESILVER";
    private static final Set<Character> bronzeSilverSet = new HashSet<>();
    private static final int[] bronzeSilverArr = new int['Z'-'A'+1];
    static{
        for(int i=0; i<BRONZESILVER.length(); i++){
            bronzeSilverSet.add(BRONZESILVER.charAt(i));
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxNum = Integer.MAX_VALUE;
        String input = br.readLine();
        for(int i=0; i<N; i++){
            char ch = input.charAt(i);
            if(bronzeSilverSet.contains(ch)){
                bronzeSilverArr[ch-'A']++;
            }
        }
        for(char ch : bronzeSilverSet){
            if(ch=='E' || ch=='R'){
                maxNum = Math.min(maxNum, bronzeSilverArr[ch-'A']/2);
            } else {
                maxNum = Math.min(maxNum, bronzeSilverArr[ch-'A']);
            }
        }
        System.out.print(maxNum);
    }
}
