package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon5565 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        for(int i=0; i<9; i++){
            totalPrice -= Integer.parseInt(br.readLine());
        }
        System.out.println(totalPrice);
    }
}
