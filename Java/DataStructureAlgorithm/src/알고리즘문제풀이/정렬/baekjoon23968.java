package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon23968 {
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
        br.close();
    }

    private static String sort(){
        int order = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N-1; j++) {
                if (map[j] > map[j + 1]) {
                    order++;
                    int temp = map[j];
                    map[j] = map[j + 1];
                    map[j + 1] = temp;
                    if (order == K) {
                        return String.format("%d %d", map[j], map[j + 1]);
                    }
                }
            }
        }
        return "-1";
    }
}
