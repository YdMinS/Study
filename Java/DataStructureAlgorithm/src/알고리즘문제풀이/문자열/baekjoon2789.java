package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon2789 {
    private static final Set<Character> CAMBRIDGE = new HashSet<>();
    static {
        CAMBRIDGE.add('C');
        CAMBRIDGE.add('A');
        CAMBRIDGE.add('M');
        CAMBRIDGE.add('B');
        CAMBRIDGE.add('R');
        CAMBRIDGE.add('I');
        CAMBRIDGE.add('D');
        CAMBRIDGE.add('G');
        CAMBRIDGE.add('E');
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String message = br.readLine();
        for(int i=0; i<message.length(); i++){
            char ch = message.charAt(i);
            if(!CAMBRIDGE.contains(ch)) bw.write(ch);
        }
        bw.close();
    }
}
