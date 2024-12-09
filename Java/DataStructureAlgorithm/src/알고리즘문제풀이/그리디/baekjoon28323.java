package 알고리즘문제풀이.그리디;

import java.util.*;
import java.io.*;

public class baekjoon28323 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        List<Integer> evenB = new ArrayList();
        List<Integer> oddB = new ArrayList();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int e = 0;
        int o = 1;
        for(int n : A){
            int rest = n%2;
            if(rest==e){
                evenB.add(n);
                e = Math.abs(e-1);
            }
            if(rest==o){
                oddB.add(n);
                o = Math.abs(o-1);
            }
        }
        System.out.println(evenB.size()>oddB.size() ? evenB.size() : oddB.size());
    }
}
