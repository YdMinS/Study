package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon31775 {
    static Set<Character> set = new HashSet<>(Arrays.asList('l', 'k', 'p'));

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++){
            char ch = br.readLine().charAt(0);
            if(set.contains(ch)){
                set.remove(ch);
            }
        }
        System.out.println(set.isEmpty() ? "GLOBAL" : "PONIX");
    }
}
