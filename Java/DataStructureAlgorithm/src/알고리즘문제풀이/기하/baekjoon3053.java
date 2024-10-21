package 알고리즘문제풀이.기하;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon3053 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            bw.write(str1+" & "+str2+" are ");
            if(!checkAnagram(str1, str2)){
                bw.write("NOT ");
            }
            bw.write("anagrams.\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean checkAnagram(String str1, String str2){
        int length1 = str1.length();
        int length2 = str2.length();
        if(length2 != length1) return false;
        int[] chars = new int[26];
        for(int i=0; i<length1; i++){
            chars[(str1.charAt(i)-'a')] += 1;
        }
        for(int i=0; i<length2; i++){
            chars[(str2.charAt(i)-'a')] -= 1;
        }
        for(int i : chars){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
