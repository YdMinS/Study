package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon2693 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            map = new int[10];
            for(int j=0; j<10; j++){
                map[j] = Integer.parseInt(st.nextToken());
            }
            execute();
        }
        br.close();
    }

    private static void execute() throws IOException{
        Arrays.sort(map);
        bw.write(map[10-3]+"\n");
    }
}
