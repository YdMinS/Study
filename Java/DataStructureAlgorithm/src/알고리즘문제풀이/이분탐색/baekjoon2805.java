package 알고리즘문제풀이.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2805 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static long M, max, min;
    static long[] map;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Long.parseLong(st.nextToken());
        map = new long[N];
        st = new StringTokenizer(br.readLine());
        max = Long.MIN_VALUE;
        min = 0;
        for(int i=0; i<N; i++){
            map[i] = Long.parseLong(st.nextToken());
            if(max < map[i]){
                max = map[i];
            }
        }
    }

    static void execute(){
        long result = 0;
        while(min<max){
            long mid = (min + max)/2;
            long sum = 0l;
            for(long i: map){
                if(i > mid) {
                    sum += i-mid;
                }
            }
            if(sum == M){
                result = mid;
                break;
            }
            if(sum > M){
                result = mid;
                min = mid+1;
            } else {
                max = mid;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
