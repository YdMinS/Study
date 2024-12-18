package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon28691 {
    static Map<String, String> map = new HashMap<>();
    static {
        map.put("M", "MatKor");
        map.put("W", "WiCys");
        map.put("C", "CyKor");
        map.put("A", "AlKor");
        map.put("$", "$clear");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(map.get(str));
    }
}
