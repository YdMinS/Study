package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon1264 {
    static Set<Character> vowelSet = new HashSet();
    static {
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().toLowerCase();
        while(!str.equals("#")){
            str.toLowerCase();
            int cnt = 0;
            for(int i=0; i<str.length(); i++){
                if(vowelSet.contains(str.charAt(i))){
                    cnt++;
                }
            }
            bw.write(cnt+"\n");
            str = br.readLine().toLowerCase();
        }
        bw.flush();
        bw.close();
    }
}
