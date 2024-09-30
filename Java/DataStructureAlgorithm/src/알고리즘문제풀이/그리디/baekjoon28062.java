package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon28062 {
    static int N, total=0;
    static int[] map;
    static List<Integer> oddCandy = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        if(oddCandy.size()>1) {
            execute();
        }
        System.out.println(total);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
            if(map[i]%2==0){
                total+=map[i];
            } else {
                oddCandy.add(map[i]);
            }
        }
    }

    private static void execute() {
        if(oddCandy.size()%2==0){
            for(int i:oddCandy){
                total += i;
            }
        } else {
            Collections.sort(oddCandy);
            for(int i=1; i< oddCandy.size(); i++){
                total += oddCandy.get(i);
            }
        }
    }
}
