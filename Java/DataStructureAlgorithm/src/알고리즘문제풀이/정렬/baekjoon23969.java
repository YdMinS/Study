package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon23969 {
    public static void main(String[] args) throws IOException{
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
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(map[j]>map[j+1]){
                    order++;
                    int temp = map[j];
                    map[j] = map[j+1];
                    map[j+1] = temp;
                    if(order == K){
                        printMap(map);
                        return;
                    }
                }
            }
        }
        System.out.println("-1");
    }

    private static void printMap(int[] map){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<map.length; i++){
            sb.append(map[i]);
            if(i!=map.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
