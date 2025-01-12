package 알고리즘문제풀이.데이터구조;

import java.io.*;

public class baekjoon17889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long sum = 0;
        int N = 0;
        for(int i=1; ; i++){
            if(sum + i > S){
                break;
            }
            sum += i;
            N++;
        }
        System.out.println(N);
    }
}
