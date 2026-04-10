package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> indexDQ = new ArrayDeque<>();
        Deque<Integer> infoDQ = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            indexDQ.addLast(i);
            int n = Integer.parseInt(st.nextToken());
            infoDQ.addLast(n);

        }
        for (int i = 0; i < N; i++) {
            bw.write(indexDQ.pop() + " ");
            int n = infoDQ.pop();

            if (indexDQ.isEmpty()) break;

            if (n > 0) {
                for (int j = 0; j < n - 1; j++) {
                    indexDQ.addLast(indexDQ.pollFirst());
                    infoDQ.addLast(infoDQ.pollFirst());
                }
            } else {
                for (int j = 0; j < Math.abs(n); j++) {
                    indexDQ.addFirst(indexDQ.pollLast());
                    infoDQ.addFirst(infoDQ.pollLast());
                }
            }
        }
        bw.flush();
    }
}
