package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1267 {
    static final int REF_Y = 30, PRICE_Y=10;
    static final int REF_M = 60, PRICE_M=15;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long priceY = 0;
        long priceM = 0;
        for(int i=0; i<N; i++){
            int time = Integer.parseInt(st.nextToken());
            priceY += calculate(time, 'Y') * PRICE_Y;
            priceM += calculate(time, 'M') * PRICE_M;
        }
        if(priceM == priceY){
            System.out.println("Y M "+priceY);
            return;
        }
        if(priceY < priceM){
            System.out.println("Y "+priceY);
        } else {
            System.out.println("M "+priceM);
        }
    }

    private static int calculate(int time, char ch){
        int ref = ch=='Y' ? REF_Y : REF_M;
        return time/ref+1;
    }
}
