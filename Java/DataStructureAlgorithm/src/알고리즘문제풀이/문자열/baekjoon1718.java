package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon1718 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        String key = br.readLine();
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch == ' '){
                bw.write(" ");
                continue;
            }
            char keyCh = key.charAt(i%key.length());
            if(ch - keyCh > 0 ){
                bw.write(ch - keyCh + 'a' -1);
            } else {
                int rest = keyCh - ch;
                bw.write((char)('z'-rest));
            }
        }
        bw.close();
    }
}
