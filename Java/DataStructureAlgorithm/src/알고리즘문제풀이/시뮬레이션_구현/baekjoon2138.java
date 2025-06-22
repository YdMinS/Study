package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2138 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, cnt=0;
    static boolean isMatched = false;
    static int[] map, test, ref;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        ref = new int[N];
        String str = br.readLine();
        for(int i=0; i<N; i++){
            map[i] = Character.getNumericValue(str.charAt(i));
        }
        str = br.readLine();
        for(int i=0; i<N; i++){
            ref[i] = Character.getNumericValue(str.charAt(i));
        }
    }

    private static void execute(){
        for(int i=0; i<=N; i++){
            test = map;
            dfs(0, 1);
            if(isMatched) return;
            cnt++;
        }

    }

    private static void dfs(int x, int depth){
        if(isMatched) return;
        if(depth == cnt){
            isMatched = match();
        }

    }

    private static boolean match(){
        for(int i=0; i<N; i++){
            if(map[i]!=ref[i]) return false;
        }
        return true;
    }

    private static void output(){
        System.out.println(cnt<=N ? cnt : "-1");
    }
}
