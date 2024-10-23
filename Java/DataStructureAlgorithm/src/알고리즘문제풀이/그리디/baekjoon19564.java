package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class baekjoon19564 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        char current = 'z';
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c<=current){
                cnt++;
            }
            current = c;
        }
        System.out.println(cnt);
    }
}
