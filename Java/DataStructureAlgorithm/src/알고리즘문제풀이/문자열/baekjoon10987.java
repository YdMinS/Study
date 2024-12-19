package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon10987 {
    static Set<Character> vowelSet = new HashSet<>();
    static {
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int cnt = 0;
        for(int i=0; i<st.length(); i++){
            if(vowelSet.contains(st.charAt(i))){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
