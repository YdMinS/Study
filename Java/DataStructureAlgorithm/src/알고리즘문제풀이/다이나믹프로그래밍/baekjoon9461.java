package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.*;

public class baekjoon9461 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] P = new long[101];
        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;
        P[6] = 3;
        for(int i=7; i<=100; i++){
            P[i] = P[i-1] + P [i-5];
        }
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            bw.write(P[Integer.parseInt(br.readLine())]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
