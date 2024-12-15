package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon16212 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            pq.offer(num);
        }
        while(!pq.isEmpty()){
            bw.write(pq.poll()+"");
            if(pq.size()>0){
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
