package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon4583 {
    private static final String INVALID = "DILAVNI";
    private static final Map<Character, Character> MIRRORING = new HashMap<>();
    static {
        MIRRORING.put('b', 'd');
        MIRRORING.put('d', 'b');
        MIRRORING.put('i', 'i');
        MIRRORING.put('o', 'o');
        MIRRORING.put('p', 'q');
        MIRRORING.put('q', 'p');
        MIRRORING.put('v', 'v');
        MIRRORING.put('x', 'x');
        MIRRORING.put('w', 'w');
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals("#")){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(MIRRORING.containsKey(ch)){
                    stringBuilder.append(MIRRORING.get(ch));
                } else {
                    stringBuilder.setLength(0);
                    stringBuilder.append(INVALID);
                    break;
                }
            }
            bw.write(stringBuilder.reverse().toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
