package 알고리즘문제풀이.수학;

import java.io.*;
import java.util.*;

public class baekjoon2460 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int currentNum = 0;
        for(int i=0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int getOff = Integer.parseInt(st.nextToken());
            int getOn = Integer.parseInt(st.nextToken());
            currentNum += getOn-getOff;
            if(max < currentNum){
                max = currentNum;
            }
        }
        System.out.println(max);
    }
}
