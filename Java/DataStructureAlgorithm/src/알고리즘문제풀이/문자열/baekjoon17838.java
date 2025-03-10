package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon17838 {
    private static final String PATTERN = "0011011";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String command = br.readLine();
            bw.write(isLiked(command) ? "1" : "0");
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static boolean isLiked(String command){
        if(command.length()!=7) return false;
        Map<Character, Integer> charMap = new HashMap<>();
        int patternNum = 0;
        StringBuilder pattern = new StringBuilder();
        for(int i=0; i<command.length(); i++){
            char ch = command.charAt(i);
            if(!charMap.containsKey(ch) && charMap.size()!=2){
                charMap.put(ch, patternNum);
                patternNum++;
            }
            pattern.append(charMap.get(ch));
        }
        if(charMap.size()!=2) return false;
        return pattern.toString().equals(PATTERN);
    }
}
