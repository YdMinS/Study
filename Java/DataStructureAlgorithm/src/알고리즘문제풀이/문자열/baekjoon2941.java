package 알고리즘문제풀이.문자열;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon2941 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Map<Character, List<String>> map = new HashMap<>();

    public static void main(String[] ars) throws IOException{
        String str = input();
        int cnt = countCRAlphabet(str);
        System.out.println(cnt);
    }

    private static String input() throws IOException{
        map.put('c', Arrays.asList("=","-"));
        map.put('d', Arrays.asList("z=", "-"));
        map.put('l', Arrays.asList("j"));
        map.put('n', Arrays.asList("j"));
        map.put('s', Arrays.asList("="));
        map.put('z', Arrays.asList("="));
        return br.readLine();
    }

    private static int countCRAlphabet(String str){
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            List<String> list = map.get(ch);
            if(list!=null) {
                if (ch != 'd' && i<str.length()-1) {
                    String st = str.charAt(i + 1) + "";
                    if (list.contains(st)) {
                        i++;
                    }
                } else{
                    if (i<str.length()-1 && str.charAt(i + 1) == '-') {
                        i++;
                    } else if (i<str.length()-2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                        i+=2;
                    }
                }
            }
            cnt++;
        }
        return cnt;
    }
}

