package 알고리즘문제풀이.정렬;

import java.lang.*;
import java.util.*;
import java.io.*;

public class baekjoon25305 {
    static int N, turn;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(map[N-turn]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        turn = Integer.parseInt(st.nextToken());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(map);
    }
}
