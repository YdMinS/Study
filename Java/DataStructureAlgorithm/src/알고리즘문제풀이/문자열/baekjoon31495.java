package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31495 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        char ch1 = st.charAt(0);
        char ch2 = st.charAt(st.length()-1);
        if(st.length()>2 && ch1==ch2 && ch1=='"'){
            String content = st.substring(1, st.length()-1);
            System.out.println(content.isEmpty() ? "CE" : content);
        } else {
            System.out.println("CE");
        }
    }
}
