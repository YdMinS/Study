package 알고리즘문제풀이.수학;

import java.io.*;
import java.util.*;

public class baekjoon1037 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, result;
    static int[] map;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            map[i] = num;
        }
        Arrays.sort(map);
    }

    static void execute() {
        if(map.length==1){
            result = map[0]*map[0];
        } else {
            result = map[0]*map[map.length-1];
        }
    }

    static void output(){
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }
}
