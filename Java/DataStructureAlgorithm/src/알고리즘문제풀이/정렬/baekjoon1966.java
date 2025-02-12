package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon1966 {
    static class CustomNumber{
        int value;
        int index;

        CustomNumber(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int initialIndex = Integer.parseInt(st.nextToken());
            Queue<CustomNumber> q = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<num; j++){
                int n = Integer.parseInt(st.nextToken());
                q.offer(new CustomNumber(n, j));
                pq.offer(n);
            }
            int order = 1;
            while(!pq.isEmpty()){
                CustomNumber customNumber = q.poll();
                if(customNumber.value == pq.peek()){
                    if(customNumber.index == initialIndex) break;
                    pq.poll();
                    order++;
                } else {
                    q.offer(customNumber);
                }
            }
            System.out.println(order);
        }
    }
}
