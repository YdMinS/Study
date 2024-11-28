package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon11004 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] map = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(map);
        System.out.println(map[K-1]);
    }
}
