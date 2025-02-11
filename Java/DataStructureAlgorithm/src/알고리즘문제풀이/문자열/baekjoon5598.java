package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5598 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String encodedStr = br.readLine();
        StringBuilder decodedStr = new StringBuilder();
        for(int i=0; i<encodedStr.length(); i++){
            char ch = (char)(encodedStr.charAt(i)-3);
            if(ch<'A'){
                ch = (char)('Z' - ('A' - ch));
            }
            decodedStr.append(ch);
        }
        System.out.println(decodedStr);
    }
}
