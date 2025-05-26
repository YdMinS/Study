package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon25704 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int couponNum = Integer.parseInt(br.readLine())/5;
        int price = Integer.parseInt(br.readLine());
        int minPrice = price;
        if(couponNum>=1) minPrice = Math.min(minPrice, price-500);
        if(couponNum>=2) minPrice = Math.min(minPrice, price*90/100);
        if(couponNum>=3) minPrice = Math.min(minPrice, price-2000);
        if(couponNum>=4) minPrice = Math.min(minPrice, price*75/100);
        System.out.print(Math.max(minPrice, 0));
    }
}
