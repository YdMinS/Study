package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;

public class baekjoon17828 {
    static long N;
    static int cnt=5;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        dfs(0, 0, (long)Math.sqrt(N));
        System.out.println(cnt==5 ? "-1" : cnt);
    }

    public static void dfs(int depth, long sum, long start){
        if(depth >= cnt || sum > N || depth > 4) return;
        if(sum == N){
            cnt = Math.min(cnt, depth);
            return;
        }
        for(long i=start; i>0; i--){
            long square = i*i;
            if(sum+square>N) continue;
            dfs(depth+1, sum+square, i);
        }
        if(cnt < 5) return;
    }
}
