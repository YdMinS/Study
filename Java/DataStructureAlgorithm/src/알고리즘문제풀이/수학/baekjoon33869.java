package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon33869 {
    private static final List<Character> decodeList = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        String code = input();
        execute(code);
    }

    private static String input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String decodeStr = br.readLine();
        for(int i=0; i<decodeStr.length(); i++){
            char ch = decodeStr.charAt(i);
            if(!decodeList.contains(ch)){
                decodeList.add(ch);
            }
        }
        for(int i=0; i<='Z'-'A'; i++){
            char ch = (char)('A'+i);
            if(!decodeList.contains(ch)){
                decodeList.add(ch);
            }
        }
        return br.readLine();
    }

    private static void execute(String code){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<code.length(); i++){
            int index = code.charAt(i) - 'A';
            sb.append(decodeList.get(index));
        }
        System.out.println(sb);
    }
}
