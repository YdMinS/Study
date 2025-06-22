package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1094 {
    private static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static{
        pq.offer(64);
    }
    private static int N;

    public static void main(String[] args) throws IOException{
        input();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }
}
