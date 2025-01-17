package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon1417 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int first = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=1; i<N; i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }
        while(!pq.isEmpty() && first <= pq.peek()){
            int num = pq.poll();
            if(first<=num) {
                cnt++;
                first++;
                pq.offer(num-1);
            }
        }
        System.out.println(cnt);
    }
}
