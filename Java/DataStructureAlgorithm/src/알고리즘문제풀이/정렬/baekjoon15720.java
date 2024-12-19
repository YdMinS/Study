package 알고리즘문제풀이.정렬;

import java.io.*;
import java.util.*;

public class baekjoon15720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int burger = Integer.parseInt(st.nextToken());
        int side = Integer.parseInt(st.nextToken());
        int beverage = Integer.parseInt(st.nextToken());
        int setMenu = Math.min(burger, Math.min(side, beverage));
        int totalPrice = 0;
        int discountedPrice = 0;
        for(int i=0; i<3; i++){
            List<Integer> price = new ArrayList();
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int p = Integer.parseInt(st.nextToken());
                totalPrice += p;
                discountedPrice += p;
                price.add(p);
            }
            Collections.sort(price, Collections.reverseOrder());
            for(int j=0; j<setMenu; j++){
                discountedPrice -= price.get(j)/10;
            }
        }
        System.out.println(totalPrice+"\n"+discountedPrice);
    }
}
