package 알고리즘문제풀이.이분탐색;

import java.io.*;
import java.util.*;

public class baekjoon2110 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, C;
    static long[] map;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new long[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            map[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(map);
    }

    static void execute() {

    }

    public static void main(String args[]) throws IOException {
        input();
        execute();
    }
}
