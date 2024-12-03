package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon11931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i=0; i<N; i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }
        while(!pq.isEmpty()){
            bw.write(pq.poll()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
