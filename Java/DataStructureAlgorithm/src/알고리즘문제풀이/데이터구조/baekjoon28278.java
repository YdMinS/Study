package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1 :
                    int num = Integer.parseInt(st.nextToken());
                    stack.add(num);
                    break;
                case 2 :
                    bw.write(stack.isEmpty() ? "-1\n" : stack.pop()+"\n" );
                    break;
                case 3 :
                    bw.write(stack.size()+"\n");
                    break;
                case 4 :
                    bw.write(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5 :
                    bw.write(stack.isEmpty() ? "-1\n" : stack.peek()+"\n");
            }
        }
        bw.flush();
    }
}
