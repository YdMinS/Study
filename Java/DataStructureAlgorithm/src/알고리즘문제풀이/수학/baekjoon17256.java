package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon17256 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        int az = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cx = Integer.parseInt(st.nextToken());
        int cy = Integer.parseInt(st.nextToken());
        int cz = Integer.parseInt(st.nextToken());
        int bx = cx - az;
        int by = cy / ay;
        int bz = cz - ax;
        System.out.printf("%d %d %d", bx, by, bz);
    }
}
