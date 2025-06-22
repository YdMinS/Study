package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon4691 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        while (B != 0) {
            int N = Integer.parseInt(st.nextToken());
            int A = findA(B, N);
            bw.write(A+"\n");
            st = new StringTokenizer(br.readLine());
            B = Integer.parseInt(st.nextToken());
        }
        bw.flush();
        bw.close();
    }

    private static int findA(int B, int N){
        double doubleA = Math.pow(B, 1.0/N);
        int upperA = (int)Math.ceil(doubleA);
        int underA = (int)Math.floor(doubleA);

        double upperAPowerN = Math.pow(upperA, N);
        double underAPowerN = Math.pow(underA, N);

        return Math.abs(B - upperAPowerN) < Math.abs(B - underAPowerN) ? upperA : underA;
    }
}
