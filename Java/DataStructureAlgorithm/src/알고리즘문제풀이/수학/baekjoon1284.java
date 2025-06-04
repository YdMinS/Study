package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1284 {
    private static Map<Character, Integer> numberMap = new HashMap<>();
    static{
        numberMap.put('1', 3);
        numberMap.put('0', 5);
    }

    public static void main(String[] arsg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N;
        while(!(N = br.readLine()).equals("0")){
            int result = 1;
            for(int i=0; i<N.length(); i++){
                char ch = N.charAt(i);
                result += numberMap.getOrDefault(ch, 4);
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
