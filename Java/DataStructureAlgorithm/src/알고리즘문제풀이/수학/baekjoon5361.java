package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon5361 {
    private static double[] PRICE_LIST = new double[]{350.34, 230.90, 190.55, 125.30, 180.90};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            double result = 0.0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (double price : PRICE_LIST) {
                int n = Integer.parseInt(st.nextToken());
                result += price * n;
            }
            bw.write(String.format("$%.2f\n", result));
        }
        bw.flush();
        bw.close();
    }
}
