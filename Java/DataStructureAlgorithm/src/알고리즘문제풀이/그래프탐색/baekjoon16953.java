package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon16953 {
    static long A, B;
    static int min=1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        findMin();
        System.out.println(min);
    }

    private static void findMin(){
        Queue<Long> q = new LinkedList();
        q.offer(A);
        while(!q.isEmpty()){
            min++;
            int n = q.size();
            for(int i=0; i<n; i++){
                long operand = q.poll();
                long result1 = operand * 2;
                if (result1 == B) return;
                if(result1<B)q.offer(result1);
                long result2 = operand * 10 + 1;
                if (result2 == B) return;
                if(result2<B)q.offer(result2);
            }
        }
        min = -1;
    }
}
