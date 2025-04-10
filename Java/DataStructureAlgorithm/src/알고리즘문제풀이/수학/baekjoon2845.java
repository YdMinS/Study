package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2845 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int estimatedNum = A * N;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++){
            int publishedNum = Integer.parseInt(st.nextToken());
            bw.write((publishedNum - estimatedNum) + (i<4 ? " " : ""));
        }
        bw.flush();
        bw.close();
    }
}
