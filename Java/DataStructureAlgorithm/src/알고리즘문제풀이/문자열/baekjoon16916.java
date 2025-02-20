package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon16916 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String REF = br.readLine();
        String tester = br.readLine();

        if(kmp(REF, tester)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean kmp(String text, String pattern){
        int[] pi = computePi(pattern);
        int n = text.length();
        int m = pattern.length();
        int j =0;

        for(int i=0; i<n; i++){
            while(j>0 && text.charAt(i) != pattern.charAt(j)){
                j = pi[j-1];
            }
            if(text.charAt(i) == pattern.charAt(j)){
                if(j == m-1){
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    private static int[] computePi(String pattern){
        int m = pattern.length();
        int[] pi = new int[m];
        int j = 0;

        for(int i=1; i<m; i++){
            while(j>0 && pattern.charAt(i) != pattern.charAt(j)){
                j = pi[j-1];
            }
            if(pattern.charAt(i) == pattern.charAt(j)){
                pi[i] = ++j;
            }
        }
        return pi;
    }
}
