package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon4158 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static int[] cd1, cd2;

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        while(N!=0 && M!=0) {
            input(N, M);
            System.out.println(execute());
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }
    }

    private static void input(int N, int M) throws IOException{
        cd1 = new int[N];
        cd2 = new int[M];
        for(int i=0; i<N; i++){
            cd1[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(cd1);
        for(int i=0; i<M; i++){
            cd2[i] = Integer.parseInt(br.readLine());
        }
    }

    private static int execute() {
        int cnt = 0;
        for(int i=0; i<M; i++){
            if(binarySearch(cd2[i])) cnt++;
        }
        return cnt;
    }

    private static boolean binarySearch(int x){
        int left = 0, right = N-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(x==cd1[mid]) return true;
            if(x>cd1[mid]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return false;
    }
}
