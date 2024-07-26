package 알고리즘문제풀이.이분탐색;

import java.io.*;
import java.util.*;

public class baekjoon2343 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, max, min = 1;
    static int[] map;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
            max += map[i];
            if(min < map[i]){
                min = map[i];
            }
        }
    }

    static void execute() {
        int left = min;
        int right = max;
        int result = 0;
        while(left <= right){
            int mid = (left + right)/2;
            int cnt = M;
            int middleSum = mid;
            for(int i: map){
                if(middleSum - i >=0){
                    middleSum -= i;
                } else {
                    cnt --;
                    middleSum = mid - i;
                }
            }
            if(cnt<=0){
                left = mid + 1;
            } else {
                right = mid -1;
                result = mid;
            }
        }
        System.out.println(result);
    }

    public static void main(String args[]) throws IOException {
        input();
        execute();
    }
}