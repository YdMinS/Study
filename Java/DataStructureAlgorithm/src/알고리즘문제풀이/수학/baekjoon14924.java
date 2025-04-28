package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon14924 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        System.out.print(D/S/2*T);
    }
}
