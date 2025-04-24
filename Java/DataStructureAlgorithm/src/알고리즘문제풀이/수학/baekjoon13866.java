package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon13866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<4; i++){
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(Math.abs(2 * ( max + min ) - sum));
    }
}
