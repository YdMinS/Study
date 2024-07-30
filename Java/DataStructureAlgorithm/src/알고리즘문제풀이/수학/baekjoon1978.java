package 알고리즘문제풀이.수학;

import java.io.*;
import java.lang.*;
import java.util.*;

public class baekjoon1978 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, result=0;
    static int[] map;


    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute(){
        for(int i: map){
            if(i==1) continue;
            int num = i;
            int j=2;
            while(num%j != 0){
                j++;
            }
            if(j==num) result++;
        }
    }

    static void output() {
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
        output();
    }
}
