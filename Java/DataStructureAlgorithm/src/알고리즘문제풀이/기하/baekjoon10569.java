package 알고리즘문제풀이.기하;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon10569 {
    static int N;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        input();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(2-a+b+"\n");
        }
        br.close();
    }
}
