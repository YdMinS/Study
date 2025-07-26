package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon4344 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            bw.write(String.format("%.3f%%%n", findRatio()));
        }
        bw.flush();
        bw.close();
    }

    private static double findRatio() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] scoreArr = new int[n];
        double sum = 0;
        for (int i=0; i<n; i++) {
            scoreArr[i] = Integer.parseInt(st.nextToken());
            sum += scoreArr[i];
        }
        double average = sum / n;
        double cnt = 0;
        for (int score : scoreArr) {
            if (score > average) cnt++;
        }
        return (double) Math.round(cnt * 1000.0) /n / 10;
    }
}
