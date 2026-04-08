package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon12789 {
    public static void main(String[] args) throws IOException {
        final String NICE = "Nice";
        final String SAD = "Sad";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int expectedNum = 1;
        Stack<Integer> subLine = new Stack<>();

        for (int i=0; i<N; i++) {
            int currentNum = Integer.parseInt(st.nextToken());

            if (currentNum == expectedNum) {
                expectedNum++;
            } else {
                while (!subLine.isEmpty() && subLine.peek() == expectedNum) {
                    subLine.pop();
                    expectedNum++;
                }
                subLine.push(currentNum);
            }

            while (!subLine.isEmpty() && subLine.peek() == expectedNum) {
                subLine.pop();
                expectedNum++;
            }
        }

        boolean isNice = subLine.isEmpty();
        System.out.println(isNice ? NICE : SAD);
    }
}
