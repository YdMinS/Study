package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2783 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double price = Double.parseDouble(st.nextToken());
        int gram = Integer.parseInt(st.nextToken());
        double pricePerGram = price/gram;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            price = Double.parseDouble(st.nextToken());
            gram = Integer.parseInt(st.nextToken());
            double currentPricePerGram = price/gram;
            pricePerGram = Math.min(pricePerGram, currentPricePerGram);
        }
        System.out.printf("%.2f", pricePerGram * 1000);
    }
}
