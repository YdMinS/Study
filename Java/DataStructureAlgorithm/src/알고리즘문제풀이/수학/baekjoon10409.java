package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon10409 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int i = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int t = Integer.parseInt(st.nextToken());
            if (T>t) {
                T -= t;
                i++;
            } else {
                System.out.println(T==t ? i+1 : i);
                return;
            }
        }
        System.out.println(i);
    }
}
