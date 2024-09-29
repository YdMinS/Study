package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon14720 {
    static int N, cnt=0;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void execute(){
        int toDrink = 0;
        for(int i=0; i<N; i++){
            if(map[i] == toDrink){
                cnt++;
                toDrink++;
                toDrink%=3;
            }
        }
    }
}
