package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon30822 {
    private static final Map<Character, Integer> charMap = new HashMap<>();
    static {
        charMap.put('u', 0);
        charMap.put('o', 1);
        charMap.put('s', 2);
        charMap.put('p', 3);
        charMap.put('c', 4);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] cnt = new int[5];
        for(int i=0; i<N; i++){
            char ch = str.charAt(i);
            if(!charMap.containsKey(ch)) continue;
            int index = charMap.get(ch);
            cnt[index]++;
        }
        int min = Integer.MAX_VALUE;
        for(int num : cnt){
            min = Math.min(min, num);
        }
        System.out.println(min);
    }
}
