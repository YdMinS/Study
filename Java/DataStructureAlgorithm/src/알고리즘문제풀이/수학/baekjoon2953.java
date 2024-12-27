package 알고리즘문제풀이.수학;

import java.io.*;
import java.util.*;

public class baekjoon2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        int maxScore = Integer.MIN_VALUE;
        for(int i=1; i<=5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int score = 0;
            while(st.hasMoreTokens()){
                score += Integer.parseInt(st.nextToken());
            }
            if(score > maxScore){
                index = i;
                maxScore = score;
            }
        }
        System.out.println(String.format("%d %d", index, maxScore));
    }
}
