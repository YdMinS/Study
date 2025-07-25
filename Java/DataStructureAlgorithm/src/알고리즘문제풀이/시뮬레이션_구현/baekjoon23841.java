package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon23841 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] paper = new char[N][M];
        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<M; j++){
                paper[i][j] = input.charAt(j);
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M/2; j++){
                char ch1 = paper[i][j];
                char ch2 = paper[i][M-1-j];
                if (ch1 != '.') {
                    paper[i][M-1-j] = ch1;
                }
                if (ch2 != '.') {
                    paper[i][j] = ch2;
                }
            }
            for(int j=0; j<M; j++){
                bw.write(paper[i][j]);
                if(j==M-1) bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
