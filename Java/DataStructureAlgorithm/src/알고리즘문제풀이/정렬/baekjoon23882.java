package 알고리즘문제풀이.정렬;

import java.io.*;
import java.util.*;

public class baekjoon23882 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        int order = 0;
        for(int i=N-1; i>0; i--){
            int maxIndex = -1;
            int currentMax = 0;
            for(int j=0; j<i; j++){
                if(map[j]>currentMax){
                    maxIndex = j;
                    currentMax = map[j];
                }
            }
            if(currentMax > map[i]){
                order++;
                int temp = map[i];
                map[i] = map[maxIndex];
                map[maxIndex] = temp;
            }
            if(order == K){
                break;
            }
        }
        if(order<K){
            System.out.println("-1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(map[i]);
            if(i<N-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
