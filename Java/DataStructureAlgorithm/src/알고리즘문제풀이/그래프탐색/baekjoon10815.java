package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon10815 {
    static int N, M;
    static int[] refCard, myCard, result;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        refCard = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            refCard[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(refCard);
        M = Integer.parseInt(br.readLine());
        myCard = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            myCard[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
    }

    private static void execute(){
        result = new int[M];
        for(int i=0; i<M; i++){
            result[i] = binarySearch(myCard[i]);
        }
    }

    private static int binarySearch(int x){
        int left = 0, right = N-1;
        int result = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(refCard[mid]==x) return 1;
            if(refCard[mid]<x){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return result;
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<M; i++){
            bw.write(result[i]+"");
            if(i<M-1) bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
