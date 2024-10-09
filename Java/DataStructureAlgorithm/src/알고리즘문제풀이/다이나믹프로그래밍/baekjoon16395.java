package 알고리즘문제풀이.다이나믹프로그래밍;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon16395 {
    static int n, m;
    static int[][] map;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(map[n-1][m-1]);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        map[0][0]=1;
        map[1][0]=1;
        map[1][1]=1;
        for(int i=2; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    map[i][j] = 1;
                } else {
                    map[i][j] = map[i - 1][j - 1] + map[i - 1][j];
                }
            }
        }
    }
}
