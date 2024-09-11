package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int refPrice = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int testPrice = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());
            testPrice += price*quantity;
        }
        if(refPrice == testPrice) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}