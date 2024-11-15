package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon23881 {
    static int N, K;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(sort());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static String sort(){
        int cnt = 0;
        for(int i=N-1; i>0; i--){
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (map[j] > map[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = map[i];
                map[i] = map[maxIndex];
                map[maxIndex] = temp;
                cnt++;

                if (cnt == K) {
                    return Math.min(map[i], map[maxIndex]) + " " + Math.max(map[i], map[maxIndex]);
                }
            }

        }
        return "-1";
    }
}
