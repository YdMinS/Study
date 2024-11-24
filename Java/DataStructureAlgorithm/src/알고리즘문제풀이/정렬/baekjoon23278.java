package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon23278 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[] map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(map);
        int sum = 0;
        for(int i=L; i<N-H; i++){
            sum += map[i];
        }
        double result = (double)sum/(N-H-L);
        System.out.println(result);
    }
}
