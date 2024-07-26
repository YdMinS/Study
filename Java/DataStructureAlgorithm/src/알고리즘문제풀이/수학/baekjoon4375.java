package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class baekjoon4375 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int N = sc.nextInt();
            long i = 1;
            int cnt = 1;
            while(i%N!=0){
                cnt++;
                i = (10*i + 1)%N;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
