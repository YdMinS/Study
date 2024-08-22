package 알고리즘문제풀이.다이나믹프로그래밍;

import java.lang.*;
import java.io.*;

public class baekjoon13398 {
    static int N;
    static long max = Integer.MIN_VALUE;
    static int[] map;
    static long[] dpLeft, dpRight;

    public static void main(String[] args) throws IOException{
        input();
        calculateMax();
        System.out.println(max);

    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        String[] strList = br.readLine().split(" ");
        for(int i=0; i<strList.length; i++) {
            map[i] = Integer.parseInt(strList[i]);
        }
        dpRight = new long[N];
        dpLeft = new long[N];
    }

    private static void calculateMax(){
        dpLeft[0] = map[0];
        dpRight[N-1] = map[N-1];
        max = map[0];

        for(int i=1; i<N; i++){
            dpLeft[i] = Math.max(dpLeft[i-1]+map[i], map[i]);
            max = Math.max(dpLeft[i], max);
        }

        for(int i=N-2; i>=0; i--){
            dpRight[i] = Math.max(dpRight[i+1]+map[i], map[i]);
        }

        if(N>1) {
            for (int i = 1; i < N - 1; i++) {
                max = Math.max(max, dpLeft[i - 1] + dpRight[i + 1]);
            }
            max = Math.max(max, dpRight[1]);
            max = Math.max(max, dpLeft[N - 2]);
        }
    }
}
