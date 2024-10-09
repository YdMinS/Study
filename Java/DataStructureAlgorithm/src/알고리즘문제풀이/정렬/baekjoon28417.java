package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon28417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int sum = Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Integer[] trick = new Integer[5];
            for(int j=0; j<5; j++){
                trick[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(trick, Collections.reverseOrder());
            sum += trick[0] + trick[1];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
