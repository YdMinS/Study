package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5704 {
    private static final String YES = "Y";
    private static final String NO = "N";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int[] alphabets;
        int sum;
        while(!(str = br.readLine()).equals("*")){
            alphabets = new int['z'-'a'+1];
            sum = 0;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch!=' ' && alphabets[ch-'a']==0){
                    sum++;
                    alphabets[ch-'a']++;
                }
            }
            bw.write(sum == alphabets.length ? YES : NO);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
