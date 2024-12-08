package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.io.*;

public class baekjoon24418 {
    static int N, cnt1=1, cnt2=0;
    static int[][] map, dp;
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};

    public static void main(String[] args) throws IOException{
        input();
        dfs(0,0);
        search();
        System.out.printf("%d %d", cnt1, cnt2);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void dfs(int x, int y){
        cnt1++;
        if(x==N-1 && y==N-1){
            return;
        }
        for(int i=0; i<2; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<N && ny<N){
                dfs(nx, ny);
            }
        }
    }

    private static void search(){
        dp = new int[N][N];
        dp[0][0] = map[0][0];
        cnt2++;
        for(int i=1; i<N; i++){
            dp[0][i] = map[0][i] + dp[0][i-1];
            dp[i][0] = map[i][0] + dp[i-1][0];
            cnt2 += 2;
        }
        for(int i=1; i<N; i++){
            for(int j=1; j<N; j++){
                dp[i][j] = map[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
                cnt2++;
            }
        }
    }
}
