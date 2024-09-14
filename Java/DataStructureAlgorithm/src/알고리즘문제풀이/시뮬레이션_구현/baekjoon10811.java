package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.util.*;
import java.io.*;

public class baekjoon10811 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, C;
    static int[] map;
    static int[][] caseMap;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    public static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[N+1];
        caseMap = new int[C][2];
        for(int i=1; i<=N; i++){
            map[i] = i;
        }
        for(int i=0; i<C; i++){
            st = new StringTokenizer(br.readLine());
            caseMap[i][0] = Integer.parseInt(st.nextToken());
            caseMap[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    public static void execute() {
        for(int i=0; i<C; i++){
            int from = caseMap[i][0];
            int to = caseMap[i][1];
            Stack<Integer> stack = new Stack();
            for(int j=from; j<=to; j++){
                stack.add(map[j]);
            }
            for(int j=from; j<=to; j++){
                int temp = stack.pop();
                map[j] = temp;
            }
        }
    }

    public static void output(){
        StringBuilder strBuilder = new StringBuilder();
        for(int i=1; i<=N; i++){
            strBuilder.append(map[i]);
            if(i<N){
                strBuilder.append(" ");
            }
        }
        System.out.println(strBuilder);
    }
}