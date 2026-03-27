package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon13241 {
    static long N, M;

    public static void main(String[] args) throws IOException {
        input();
        long result = execute();
        System.out.println(result);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
    }

    private static long execute() {
        long gcd = findGcd();
        return findLcm(gcd);
    }

    private static long findGcd() {
        long a = N;
        long b = M;
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private static long findLcm(long gcd) {
        return N / gcd * M;
    }
}
