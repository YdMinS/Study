package 알고리즘문제풀이.문자열;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon27889 {
    static Map<String, String> map = new HashMap<>();
    static {
        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(map.get(str));
    }
}
