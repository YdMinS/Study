package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon15727 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int distance = Integer.parseInt(br.readLine());
        int time = distance/5;
        if(distance%5 != 0){
            time++;
        }
        System.out.print(time);
    }
}
