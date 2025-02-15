package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon1371 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] charCnt = new int[26];
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        String str;
        while((str = br.readLine())!=null){
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch==' ') continue;
                charCnt[ch-'a']++;
                max = Math.max(charCnt[ch-'a'], max);
            }
        }
        for(int i=0; i< charCnt.length; i++){
            if(charCnt[i]==max){
                System.out.print((char)('a'+i));
            }
        }
    }
}
