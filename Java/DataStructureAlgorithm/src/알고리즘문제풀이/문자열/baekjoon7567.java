package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon7567 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pile = br.readLine();
        int height = 0;
        char last = ' ';
        for(int i=0; i<pile.length(); i++){
            char ch = pile.charAt(i);
            height += ch == last ? 5 : 10;
            if(ch!=last){
                last = ch;
            }
        }
        System.out.println(height);
    }
}
