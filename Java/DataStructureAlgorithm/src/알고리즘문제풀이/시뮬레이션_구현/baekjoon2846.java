package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon2846 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ascentSum = 0;
        int currentSum = 0;
        int prevHeight = Integer.parseInt(st.nextToken());
        for(int i=1; i<N; i++){
            int h = Integer.parseInt(st.nextToken());
            if (h > prevHeight) {
                currentSum += h - prevHeight;
            } else {
                ascentSum = Math.max(ascentSum, currentSum);
                currentSum = 0;
            }
            prevHeight = h;
        }
        System.out.println(Math.max(ascentSum, currentSum));
    }
}
