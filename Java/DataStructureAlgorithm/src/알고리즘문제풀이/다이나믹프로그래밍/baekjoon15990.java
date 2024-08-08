package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;
import java.lang.*;

public class baekjoon15990 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[][] d = new long[100001][3];
    static int dIsSet;

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    static void input(){
        d[1][0] = 1;
        d[2][1] = 1;
        d[3][0] = 1;
        d[3][1] = 1;
        d[3][2] = 1;
        dIsSet = 3;
    }

    static void execute() throws IOException{
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n<4){
                System.out.println(d[n][0]+d[n][1]+d[n][2]);
            } else {
                System.out.println(findCase(n));
            }
        }
    }

    static long findCase(int n){
        int refNum = 1000000009;
        for(int i=dIsSet+1; i<=n; i++){
            d[i][0] = (d[i-1][1]+d[i-1][2])%refNum;
            d[i][1] = (d[i-2][0]+d[i-2][2])%refNum;
            d[i][2] = (d[i-3][0]+d[i-3][1])%refNum;
        }
        dIsSet = Math.max(dIsSet,n);
        return (d[n][0]+d[n][1]+d[n][2])%refNum;
    }
}
