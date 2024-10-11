package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon9184 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<int[]> list = new ArrayList<>();
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException{
        input();
        execute();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a, b, c;
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a==-1 && b==-1 && c==-1) break;
            list.add(new int[]{a, b, c});;
        }
        br.close();
    }

    private static void execute() throws IOException{
        int a, b, c;
        int d;
        for(int[] tuple : list){
            a = tuple[0];
            b = tuple[1];
            c = tuple[2];
            d = w(a, b, c);
            bw.write(String.format("w(%d, %d, %d) = %d\n", a, b, c, d));
        }
    }

    private static int w(int a, int b, int c) {
        if(a<=0 || b<=0 || c<=0){
            return 1;
        }
        if(a>20 || b>20 || c>20){
            return w(20, 20, 20);
        }
        if(dp[a][b][c]>0) return dp[a][b][c];
        if(a<b && b<c){
            dp[a][b][c] = w(a, b, c-1)+w(a, b-1, c-1) - w(a, b-1, c);
            return dp[a][b][c];
        }
        dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        return dp[a][b][c];
    }
}
