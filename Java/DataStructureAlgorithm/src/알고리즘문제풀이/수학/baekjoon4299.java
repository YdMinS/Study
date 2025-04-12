package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon4299 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int dif = Integer.parseInt(st.nextToken());
        if((sum+dif) %2 != 0 || (sum-dif) %2 != 0 || sum < dif){
            System.out.print(-1);
            return;
        }
        int a = (sum + dif) / 2;
        int b = (sum - dif) / 2;
        System.out.printf("%d %d", Math.max(a, b), Math.min(a, b));
    }
}
