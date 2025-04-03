package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon14561 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            Deque<Integer> dq = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            while(n!=0){
                dq.add((int)(n%t));
                n /= t;
            }
            bw.write(isPalindrome(dq));
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static String isPalindrome(Deque<Integer> dq){
        while(dq.size()>1){
            int front = dq.pollFirst();
            int back = dq.pollLast();
            if(front != back) return "0";
        }
        return "1";
    }
}
