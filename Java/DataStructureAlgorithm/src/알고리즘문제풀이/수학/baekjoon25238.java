package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon25238 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int defense = a * (100 - b) / 100;
        System.out.println(defense>=100 ? 0 : 1);
    }
}
