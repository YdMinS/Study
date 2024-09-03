package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2745 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Map<Character, Integer> map = new HashMap<>();
    static{
        for(int i='0'-'0'; i<='9'-'0'; i++){
            map.put((char)('0'+i), 0+i);
        }
        for(int i='A'-'A'; i<='Z'-'A'; i++){
            map.put((char)('A'+i), 10+i);
        }
    }
    static String number;
    static int r;
    static long num=0;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(num);
    }

    private static void input() throws IOException{
        String[] str = br.readLine().split(" ");
        number = str[0];
        r = Integer.parseInt(str[1]);
    }

    private static void execute() {
        for(int i=0; i<number.length(); i++){
            num += Math.pow(r,i)*map.get(number.charAt(number.length()-1-i));
        }
    }
}
