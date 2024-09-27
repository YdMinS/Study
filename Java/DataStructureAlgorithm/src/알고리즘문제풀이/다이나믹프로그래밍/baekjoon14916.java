package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon14916 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int minCnt = -1;
        for(int i=N/5; i>=0; i--){
            int rest = N - 5*i;
            if(rest%2==0){
                int cnt = i+rest/2;
                if(minCnt!=-1){
                    minCnt = Math.min(minCnt, cnt);
                } else {
                    minCnt = cnt;
                }
            }
        }
        System.out.println(minCnt);
    }
}
