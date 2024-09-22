package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;

public class baekjoon2231 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M=0;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(M);
    }

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
    }

    private static void execute(){
        for(int i=1; i<=N; i++){
            int num = i;
            int sum = num;
            sum += num%10;
            while(num/10>0){
                num /= 10;
                sum += num%10;
            }
            if(sum == N) {
                M = i;
                return;
            }
        }
    }
}
