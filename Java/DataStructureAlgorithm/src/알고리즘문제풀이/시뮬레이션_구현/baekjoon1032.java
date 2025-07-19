package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon1032 {
    private static List<Character> charList = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            charList.add(str.charAt(i));
        }
        for(int i=0; i<N-1; i++){
            str = br.readLine();
            for(int j=0; j<str.length(); j++){
                if(charList.get(j) =='?' || str.charAt(j) ==  charList.get(j)) continue;
                charList.remove(j);
                charList.add(j, '?');
            }
        }
        for(char ch : charList){
            System.out.print(ch);
        }
    }
}
