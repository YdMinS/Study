package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon26004 {
    static Map<Character, Integer> HIARC = new HashMap<>();
    static {
        HIARC.put('H', 0);
        HIARC.put('I', 1);
        HIARC.put('A', 2);
        HIARC.put('R', 3);
        HIARC.put('C', 4);
    }
    static int[] hiarcArr = new int[5];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = Integer.MAX_VALUE;
        String str = br.readLine();
        for(int i=0; i<N; i++){
            char ch = str.charAt(i);
            int index;
            if(HIARC.containsKey(ch)){
                index = HIARC.get(ch);
                hiarcArr[index]++;
            }
        }
        for(int num : hiarcArr){
            if(num == 0){
                System.out.println(0);
                return;
            }
            cnt = Math.min(cnt, num);
        }
        System.out.println(cnt);
    }
}
