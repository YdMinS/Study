package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon5622 {
    static HashMap<Character, Integer> phone = new HashMap<>();
    static {
        phone.put('A', 3);
        phone.put('B', 3);
        phone.put('C', 3);
        phone.put('D', 4);
        phone.put('E', 4);
        phone.put('F', 4);
        phone.put('G', 5);
        phone.put('H', 5);
        phone.put('I', 5);
        phone.put('J', 6);
        phone.put('K', 6);
        phone.put('L', 6);
        phone.put('M', 7);
        phone.put('N', 7);
        phone.put('O', 7);
        phone.put('P', 8);
        phone.put('Q', 8);
        phone.put('R', 8);
        phone.put('S', 8);
        phone.put('T', 9);
        phone.put('U', 9);
        phone.put('V', 9);
        phone.put('W', 10);
        phone.put('X', 10);
        phone.put('Y', 10);
        phone.put('Z', 10);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            count += phone.get(str.charAt(i));
        }
        System.out.println(count);
    }
}
