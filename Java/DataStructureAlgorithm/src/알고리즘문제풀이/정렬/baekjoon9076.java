package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon9076 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static Integer[] scores;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            input();
            execute();
        }
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        scores = new Integer[5];
        for(int i=0; i<5; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void execute() throws IOException{
        Arrays.sort(scores);
        if(scores[3]-scores[1]>3){
            bw.append("KIN\n");
        } else {
            int sum = scores[1]+scores[2]+scores[3];
            bw.append(sum+"\n");
        }
    }
}
