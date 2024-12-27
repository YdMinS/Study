package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon2914 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int musicNum = Integer.parseInt(st.nextToken());
        int avg = Integer.parseInt(st.nextToken());
        int minRightsNum = musicNum * (avg -1) +1;
        System.out.println(minRightsNum);
    }
}
