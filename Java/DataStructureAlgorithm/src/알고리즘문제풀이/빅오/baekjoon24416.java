package 알고리즘문제풀이.빅오;

import java.lang.*;
import java.io.*;

public class baekjoon24416 {
    static int cnt1 = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fib(N);
        int cnt2 = N-2;
        System.out.println(cnt1+" "+cnt2);
    }

    private static void fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
        } else {
            fib(n - 1);
            fib(n - 2);
        }
    }
}
