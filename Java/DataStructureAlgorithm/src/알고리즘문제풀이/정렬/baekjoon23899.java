package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon23899 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] map = new int[N];
        int[] refMap = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st1.nextToken());
            refMap[i] = Integer.parseInt(st2.nextToken());
        }
        if(Arrays.equals(map, refMap)){
            System.out.println(1);
            return;
        }
        for(int i=N-1; i>0; i--){
            int maxIndex = i;
            for(int j=i-1; j>=0; j--){
                if(map[j]>map[maxIndex]){
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                int temp = map[maxIndex];
                map[maxIndex] = map[i];
                map[i] = temp;
                if(Arrays.equals(map, refMap)){
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
