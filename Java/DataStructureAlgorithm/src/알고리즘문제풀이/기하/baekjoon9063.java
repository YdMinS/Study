package 알고리즘문제풀이.기하;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon9063 {
    static int N;
    static int minX=Integer.MAX_VALUE, minY=Integer.MAX_VALUE, maxX=Integer.MIN_VALUE, maxY=Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println((maxX-minX)*(maxY-minY));
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            minX = Math.min(x, minX);
            maxX = Math.max(x, maxX);
            minY = Math.min(y, minY);
            maxY = Math.max(y, maxY);
        }
    }
}
