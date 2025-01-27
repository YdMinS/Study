package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon30454 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int maxNum = 0;
        int numOfCow = 0;
        for(int i=0; i<N; i++){
            String zibra = br.readLine();
            boolean is1 = false;
            int num = 0;
            for(int j=0; j<M; j++){
                char ch = zibra.charAt(j);
                if(ch=='1' && is1) continue;
                if(ch=='1') {
                    is1 = true;
                    num++;
                    continue;
                }
                if(ch=='0' && is1){
                    is1 = false;
                }
            }
            if(num>maxNum){
                maxNum = num;
                numOfCow = 1;
            } else if (num == maxNum){
                numOfCow++;
            }
        }
        System.out.println(String.format("%d %d", maxNum, numOfCow));
    }
}
