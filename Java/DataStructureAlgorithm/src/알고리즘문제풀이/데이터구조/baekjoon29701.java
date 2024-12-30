package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon29701 {
    private static Map<String, String> mosMap = new HashMap();
    static {
        mosMap.put(".-", "A");
        mosMap.put("-...", "B");
        mosMap.put("-.-.", "C");
        mosMap.put("-..", "D");
        mosMap.put(".", "E");
        mosMap.put("..-.", "F");
        mosMap.put("--.", "G");
        mosMap.put("....", "H");
        mosMap.put("..", "I");
        mosMap.put(".---", "J");
        mosMap.put("-.-", "K");
        mosMap.put(".-..", "L");
        mosMap.put("--", "M");
        mosMap.put("-.", "N");
        mosMap.put("---", "O");
        mosMap.put(".--.", "P");
        mosMap.put("--.-", "Q");
        mosMap.put(".-.", "R");
        mosMap.put("...", "S");
        mosMap.put("-", "T");
        mosMap.put("..-", "U");
        mosMap.put("...-", "V");
        mosMap.put(".--", "W");
        mosMap.put("-..-", "X");
        mosMap.put("-.--", "Y");
        mosMap.put("--..", "Z");
        mosMap.put(".----", "1");
        mosMap.put("..---", "2");
        mosMap.put("...--", "3");
        mosMap.put("....-", "4");
        mosMap.put(".....", "5");
        mosMap.put("-....", "6");
        mosMap.put("--...", "7");
        mosMap.put("---..", "8");
        mosMap.put("----.", "9");
        mosMap.put("-----", "0");
        mosMap.put("--..--", ",");
        mosMap.put(".-.-.-", ".");
        mosMap.put("..--..", "?");
        mosMap.put("---...", ":");
        mosMap.put("-....-", "-");
        mosMap.put(".--.-.", "@");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            bw.write(mosMap.get(st.nextToken()));
        }
        bw.flush();
        bw.close();
    }
}
