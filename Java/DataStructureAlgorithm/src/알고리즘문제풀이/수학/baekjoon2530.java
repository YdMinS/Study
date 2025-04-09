package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2530 {
    private static int MAX_TIME = 60*60*24;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int currentTime = 0;
        for(int i=0; i<3; i++){
            currentTime += Integer.parseInt(st.nextToken()) * (int)Math.pow(60, 2-i);
        }
        int cookingTime = Integer.parseInt(br.readLine());
        int resultTime = (currentTime + cookingTime)%MAX_TIME;
        Stack<Integer> time = new Stack<>();
        time.add(resultTime%60);
        time.add(resultTime/60%60);
        time.add(resultTime/3600);
        for(int i=0; i<3; i++){
            System.out.print(time.pop());
            if(i<2) System.out.print(" ");
        }
    }
}
