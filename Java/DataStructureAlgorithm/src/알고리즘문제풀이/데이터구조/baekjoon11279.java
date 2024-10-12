package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon11279 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
        br.close();
    }

    private static void execute() throws IOException{
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i : map){
            if(i==0){
                if(pq.isEmpty()){
                    bw.append(0+"\n");
                } else {
                    bw.append(pq.poll()+"\n");
                }
            } else {
                pq.offer(i);
            }
        }
    }
}
