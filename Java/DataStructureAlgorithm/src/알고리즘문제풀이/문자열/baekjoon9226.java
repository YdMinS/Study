package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon9226 {
    private static final Set<Character> vowelSet = new HashSet<>();
    static{
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
    }
    private static final String AY = "ay";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals("#")){
            char ch = str.charAt(0);
            if(vowelSet.contains(ch)){
                bw.write(str);
                bw.write(AY);
            } else {
                int index = 1;
                for(int i=1; i<str.length(); i++){
                    ch = str.charAt(i);
                    if(vowelSet.contains(ch)){
                        break;
                    }
                    index++;
                }
                bw.write(str.substring(index));
                bw.write(str.substring(0, index));
                bw.write(AY);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
