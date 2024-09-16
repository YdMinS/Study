package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2566 {
    static int max = 0;
    static int row=1, col=1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=1; i<=9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > max){
                    row = i;
                    col = j;
                    max = num;
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+col);
    }
}
