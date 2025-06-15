package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class beakjoon2506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int prev = 0;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int result = Integer.parseInt(st.nextToken());
            if(result == 1){
                sum += ++prev;
            } else {
                prev = 0;
            }
        }
        System.out.print(sum);
    }
}
