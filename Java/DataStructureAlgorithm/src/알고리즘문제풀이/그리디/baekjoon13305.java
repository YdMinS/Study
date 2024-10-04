package 알고리즘문제풀이.그리디;

import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon13305 {
    static int N;
    static BigInteger totalPrice = BigInteger.ZERO;
    static int[] oilPrice, distance;
    static long[] minOilPrice;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(totalPrice);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        distance = new int[N-1];
        oilPrice = new int[N-1];
        minOilPrice = new long[N-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            oilPrice[i] = Integer.parseInt(st.nextToken());
        }
        minOilPrice[0] = oilPrice[0];
        totalPrice = totalPrice.add(new BigInteger((minOilPrice[0]*distance[0])+""));
    }

    private static void execute() {
        for(int i=1; i<N-1; i++){
            minOilPrice[i] = minOilPrice[i-1]>oilPrice[i] ? oilPrice[i] : minOilPrice[i-1];
            totalPrice = totalPrice.add(new BigInteger((minOilPrice[i] * distance[i])+""));
        }
    }
}
