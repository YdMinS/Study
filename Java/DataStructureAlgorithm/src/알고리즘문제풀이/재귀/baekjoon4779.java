package 알고리즘문제풀이.재귀;

import java.io.*;

public class baekjoon4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        while (input != null && !input.isBlank()) {
            int N = Integer.parseInt(input);
            if (N == 0) {
                System.out.print("-");
            } else {
                findCantor((int)Math.pow(3, N));
            }
            System.out.print("\n");
            input = br.readLine();
        }
    }

    private static void findCantor(int N) throws IOException{
        int n = N/3;
        if (n == 1) {
            System.out.print("- -");
        } else {
            findCantor(n);
            System.out.print(" ".repeat(n));
            findCantor(n);
        }
    }
}
