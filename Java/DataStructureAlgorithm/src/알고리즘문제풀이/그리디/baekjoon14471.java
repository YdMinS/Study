package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon14471 {
    static int N, M, cnt=0, price=0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        if(cnt<M-1){
            execute();
        }
        System.out.println(price);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a<N){
                list.add(N-a);
            } else {
                cnt++;
            }
        }
    }

    private static void execute(){
        int index = M-1-cnt;
        Collections.sort(list);
        for(int i=0; i<index; i++){
            price += list.get(i);
        }
    }
}
