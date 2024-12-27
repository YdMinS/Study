package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon2455 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int current = 0;
        for(int i=0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int getOff = Integer.parseInt(st.nextToken());
            int getOn = Integer.parseInt(st.nextToken());
            current += (getOn - getOff);
            max = Math.max(current, max);
        }
        System.out.println(max);
    }
}
