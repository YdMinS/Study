package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon24051 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] numArr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        int order = 0;
        for(int i=1; i<N; i++){
            int tester = numArr[i];
            int j;
            for(j=i-1; j>=0 && numArr[j]>tester; j--){
                order++;
                numArr[j+1] = numArr[j];
                if(order == K) {
                    System.out.println(numArr[j+1]);
                    return;
                }
            }
            if(j+1 != i){
                order++;
                numArr[j+1] = tester;
                if(order == K){
                    System.out.println(tester);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
