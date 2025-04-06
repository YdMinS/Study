package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon5211 {
    private static final String CMajor = "C-major";
    private static final String AMinor = "A-minor";
    private static final Map<Character, Character> melody = new HashMap<>();
    static{
        melody.put('A', 'A');
        melody.put('D', 'A');
        melody.put('E', 'A');
        melody.put('C', 'C');
        melody.put('F', 'C');
        melody.put('G', 'C');
    }
    private static int cNum = 0, aNum = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] melodyArr = input.split("\\|");
        for(int i=0; i<melodyArr.length; i++){
            String melodyModule = melodyArr[i];
            char ch = melodyModule.charAt(0);
            if(melody.containsKey(ch)){
                char AC = melody.get(ch);
                countAC(AC);
            }
        }
        if (cNum == aNum) {
            char lastCh = '\0';
            for (int i = input.length() - 1; i >= 0; i--) {
                char ch = input.charAt(i);
                if (ch != '|') {
                    lastCh = ch;
                    break;
                }
            }
            if (melody.containsKey(lastCh)) {
                countAC(melody.get(lastCh));
            }
        }
        System.out.print(cNum>aNum ? CMajor : AMinor);
    }

    private static void countAC(char ch){
        switch (ch){
            case 'C':
                cNum++;
                break;
            case 'A':
                aNum++;
        }
    }
}
