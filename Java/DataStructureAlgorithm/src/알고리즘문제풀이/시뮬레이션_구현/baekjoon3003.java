package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon3003 {
    static StringBuilder strBuilder = new StringBuilder();
    static int[] map = new int[6];
    static int[] refMap = new int[]{1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
        input();
        execute();
        System.out.println(strBuilder);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void execute() {
        for (int i = 0; i < map.length; i++) {
            strBuilder.append(refMap[i] - map[i]);
            if (i < map.length - 1) {
                strBuilder.append(" ");
            }
        }
    }
}