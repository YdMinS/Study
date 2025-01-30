package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon30958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] charNum = new int['z'-'a'];
        int N = Integer.parseInt(br.readLine());
        String lyric = br.readLine();
        for(int i=0; i<N; i++){
            char ch = lyric.charAt(i);
            if(ch==' ' || ch==',' || ch=='.') continue;
            charNum[ch-'a']++;
        }
        Arrays.sort(charNum);
        System.out.println(charNum[charNum.length-1]);
    }
}
