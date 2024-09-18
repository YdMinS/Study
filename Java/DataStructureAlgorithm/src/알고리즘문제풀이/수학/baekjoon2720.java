package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;

public class baekjoon2720 {
    static StringBuilder strBuilder = new StringBuilder();
    static int[] coins = {25, 10, 5, 1};
    static int[] price;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(strBuilder);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        price = new int[N];
        for(int i=0; i<N; i++){
            price[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void execute(){
        for(int i=0; i<price.length; i++){
            int num = price[i];
            for(int j=0; j<coins.length; j++){
                strBuilder.append(num/coins[j]);
                num %= coins[j];
                if(j<coins.length-1){
                    strBuilder.append(" ");
                }
            }
            strBuilder.append("\n");
        }
    }
}
