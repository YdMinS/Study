package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon11948 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int tempMin = Integer.MAX_VALUE;
        int tempMax = Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            int num = Integer.parseInt(br.readLine());
            sum += num;
            tempMin = Math.min(tempMin, num);
        }
        sum -= tempMin;
        for(int i=0; i<2; i++){
            tempMax = Math.max(tempMax, Integer.parseInt(br.readLine()));
        }
        sum += tempMax;
        System.out.print(sum);
    }
}
