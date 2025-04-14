package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon5543 {
    static int[] burgerPrices = new int[3];
    static int[] beveragePrice = new int[2];

    public static void main(String[] args) throws IOException{
        input();
        int minBurgerPrice = findMinBurgerPrice();
        int minBeveragePrice = findMinBeveragePrice();
        int setPrice = minBurgerPrice + minBeveragePrice - 50;
        System.out.print(setPrice);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++){
            burgerPrices[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<2; i++){
            beveragePrice[i] = Integer.parseInt(br.readLine());
        }
    }

    private static int findMinBurgerPrice(){
        int min = Integer.MAX_VALUE;
        for(int price : burgerPrices){
            min = Math.min(min, price);
        }
        return min;
    }

    private static int findMinBeveragePrice(){
        return Math.min(beveragePrice[0], beveragePrice[1]);
    }
}
