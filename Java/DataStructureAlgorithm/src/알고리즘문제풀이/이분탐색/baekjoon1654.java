package 알고리즘문제풀이.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1654 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static long max = 0l;
    static long[] map;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new long[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            map[i] = Long.parseLong(st.nextToken());
            if(map[i] > max){
                max = map[i];
            }
        }
    }

    static void execute(){
        long left = 1;
        long right = max;
        long result = 0;
        while(left<=right){
            long mid = (left + right) / 2;
            int cnt = 0;
            for(long i : map){
                cnt += i/mid;
            }
            if(cnt<M){
                right = mid-1;
            } else {
               left = mid +1;
               result = mid;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
