package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon29716 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int criteria = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int yield = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(isYieldable(str)<=criteria) yield++;
        }
        System.out.println(yield);
    }
    
    private static int isYieldable(String str){
        int score = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z') score += 4;
            else if (ch == ' ') score++;
            else score += 2;
        }
        return score;
    }
}
