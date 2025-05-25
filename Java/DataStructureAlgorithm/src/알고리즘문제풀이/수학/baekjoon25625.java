package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon25625 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int result = x > y ? x + y : y - x;
        System.out.print(result);
    }
}
