package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11399 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, time;
    static List<Integer> map = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(time);
    }

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(map);
    }

    private static void execute(){
        for(int i=0; i<N; i++){
            time += map.get(i) * (N-i);
        }
    }
}
