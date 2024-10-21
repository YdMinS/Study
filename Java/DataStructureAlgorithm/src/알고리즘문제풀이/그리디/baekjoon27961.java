package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class baekjoon27961 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if(N==0){
            System.out.println(0);
        } else if (N==1) {
            System.out.println(1);
        } else {
            int cnt = 1;
            long cat = 1;
            while(cat<N){
                if(N/2>=cat){
                    cat *= 2;
                    cnt++;
                } else {
                    cat += N-cat;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
