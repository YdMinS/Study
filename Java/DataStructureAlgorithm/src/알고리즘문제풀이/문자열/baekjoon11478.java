package 알고리즘문제풀이.문자열;

import java.io.*;
import java.util.*;

public class baekjoon11478 {
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        String str = input();
        parseSet(str);
        System.out.println(set.size());
    }

    private static String input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static void parseSet(String str) {
        for(int i=1; i<=str.length(); i++) {
            for(int j=0; j+i<=str.length(); j++) {
                String subStr = str.substring(j, j+i);
                set.add(subStr);
            }
        }
    }
}
