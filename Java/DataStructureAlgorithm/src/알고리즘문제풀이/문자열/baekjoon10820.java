package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon10820 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while((str = br.readLine()) != null){
            int C = 0;
            int c = 0;
            int n = 0;
            int s = 0;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(Character.isUpperCase(ch)) C++;
                else if(Character.isLowerCase(ch)) c++;
                else if(Character.isDigit(ch)) n++;
                else if(ch==' ') s++;
            }
            bw.write(c + " " + C + " " + n + " " + s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
