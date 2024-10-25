package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.io.*;

public class baekjoon11660 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, M;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        input();
        for(int i=0; i<M; i++){
            int[] points = getPoint();
            bw.write((calculate(points[0], points[1], points[2], points[3])+"\n"));
        }
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }
    }

    private static int[] getPoint() throws IOException{
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        return new int[]{x1, y1, x2, y2};
    }

    private static int calculate(int x1, int y1, int x2, int y2){
        return dp[x2][y2]- dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
    }
}
