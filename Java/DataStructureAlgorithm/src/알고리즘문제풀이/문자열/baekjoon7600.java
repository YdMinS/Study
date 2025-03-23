package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon7600 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(!(str = br.readLine()).equals("#")){
            int[] alphabetCnt = new int['z'-'a'+1];
            for(int i=0; i<str.length(); i++){
                char ch = Character.toLowerCase(str.charAt(i));
                if(ch>='a' && ch<='z') alphabetCnt[ch-'a']++;
            }
            int result = 0;
            for(int cnt : alphabetCnt) result += (cnt!=0 ? 1: 0);
            System.out.println(result);
        }
    }
}
