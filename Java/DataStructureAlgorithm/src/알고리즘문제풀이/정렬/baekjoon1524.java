package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon1524 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            br.readLine();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            PriorityQueue<Integer> pqa = new PriorityQueue<>();
            PriorityQueue<Integer> pqb = new PriorityQueue<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<a; j++){
                pqa.offer(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++){
                pqb.offer(Integer.parseInt(st.nextToken()));
            }
            stringBuilder.append(play(pqa, pqb));
        }
        System.out.println(stringBuilder);
    }

    private static String play(PriorityQueue<Integer> A, PriorityQueue<Integer> B){
        while(!A.isEmpty() && !B.isEmpty()){
            int a = A.peek();
            int b = B.peek();
            if (a >= b) {
                B.poll();
            } else {
                A.poll();
            }
        }
        return B.isEmpty() ? "S\n" : "B\n";
    }
}
