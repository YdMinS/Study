package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon1864 {
    private static final Map<Character, Integer> decodeMap = new HashMap<>();
    static {
        decodeMap.put('-', 0);
        decodeMap.put('\\', 1);
        decodeMap.put('(', 2);
        decodeMap.put('@', 3);
        decodeMap.put('?', 4);
        decodeMap.put('>', 5);
        decodeMap.put('&', 6);
        decodeMap.put('%', 7);
        decodeMap.put('/', -1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals("#")){
            int decodedNum = 0;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                decodedNum += decodeMap.get(ch) * (int)Math.pow(8, str.length()-1-i);
            }
            bw.write(decodedNum+"\n");
        }
        bw.close();
    }
}
