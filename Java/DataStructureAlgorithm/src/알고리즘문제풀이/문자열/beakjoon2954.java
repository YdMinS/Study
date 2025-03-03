package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class beakjoon2954 {
    private static final Set<Character> vowelSet = new HashSet<>();
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
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(vowelSet.contains(ch)){
                char p = str.charAt(++i);
                char vowel = str.charAt(++i);
                if(p!='p' || vowel!=ch) return;
            }
            bw.write(ch);
        }
        bw.flush();
        bw.close();
    }
}
