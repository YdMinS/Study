package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon14425 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static HashSet<String> strSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(check());
    }

    private static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            strSet.add(br.readLine());
        }
    }

    private static int check() throws IOException {
        int cnt = 0;

        for (int i=0; i<M; i++) {
            if (strSet.contains(br.readLine())) cnt++;
        }

        return cnt;
    }
}
