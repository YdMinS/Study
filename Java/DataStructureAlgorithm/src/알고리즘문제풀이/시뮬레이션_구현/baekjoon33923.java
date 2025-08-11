package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon33923 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int maxArea;
        if (N!=M) {
            maxArea = (int)Math.pow(Math.min(N-1, M-1), 2);
        } else {
            maxArea = (int)(1 + Math.pow(N-2, 2));
        }
        System.out.println(maxArea);
    }
}
