package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon10972 {
    static int N;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        if(nextPermutation()){
            output();
        } else {
            System.out.println(-1);
        }
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static boolean nextPermutation(){
        int i = N-1;
        while(i>0 && map[i-1]>=map[i]) i--;
        if(i<=0) return false;

        int j = N-1;
        while(map[j] <= map[i-1]) j--;

        swap(i-1, j);

        j=N-1;
        while(i<j){
            swap(i, j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int i, int j){
        int temp = map[i];
        map[i] = map[j];
        map[j] = temp;
    }

    private static void output() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map[i]);
            if (i < N - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
