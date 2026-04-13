package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon24511 {
    public static void main(String[] args) throws IOException {
        // QUEUE 0, STACK 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        StringTokenizer dataTypeSt = new StringTokenizer(br.readLine());
        StringTokenizer dataSt = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int type = Integer.parseInt(dataTypeSt.nextToken());
            int num = Integer.parseInt(dataSt.nextToken());
            if (type == 0) dq.addFirst(num);
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer numberToExecute = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(numberToExecute.nextToken());
            if (!dq.isEmpty()) {
                bw.write(dq.pollFirst() + " ");
                dq.addLast(num);
            } else {
                bw.write(num + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
