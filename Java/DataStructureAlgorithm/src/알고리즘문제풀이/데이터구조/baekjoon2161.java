package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon2161 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for(int i=1; i<=N; i++){
            dq.offer(i);
        }
        while(dq.size()>=2){
            int a = dq.poll();
            int b = dq.poll();
            bw.write(a+" ");
            dq.offer(b);
        }
        bw.write(dq.pop()+"");
        bw.flush();
        bw.close();
    }
}
