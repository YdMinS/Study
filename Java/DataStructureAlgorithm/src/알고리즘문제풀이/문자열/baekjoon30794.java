package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon30794 {
    static Map<String, Integer> grade = new HashMap<>();
    static {
        grade.put("miss", 0);
        grade.put("bad", 200);
        grade.put("cool", 400);
        grade.put("great", 600);
        grade.put("perfect", 1000);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int num = grade.get(st.nextToken());
        System.out.println(N * num);
    }
}
