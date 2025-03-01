package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon18245 {
    private static final String EOF = "Was it a cat I saw?";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int index = 1;
        while(!(str = br.readLine()).equals(EOF)){
            for(int i=0; i<str.length(); i += index + 1){
                bw.write(str.charAt(i));
            }
            bw.newLine();
            index++;
        }
        bw.flush();
        bw.close();
    }
}
