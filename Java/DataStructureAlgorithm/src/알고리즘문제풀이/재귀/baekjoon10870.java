package 알고리즘문제풀이.재귀;

import java.io.*;

public class baekjoon10870 {
    public static void main(String[] args) throws IOException {
        int last = 0;
        int current = 1;
        int index = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
            return;
        }
        while (index != N) {
            int sum = last + current;
            last = current;
            current = sum;
            index++;
        }
        System.out.println(current);
    }
}
