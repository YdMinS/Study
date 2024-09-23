package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;

public class baekjoon2839 {
    static int N, cnt = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    private static void execute() {
        for(int i=N/5; i>=0; i--){
            int rest = N - 5 * i;
            if(rest%3 ==0 ){
                cnt = Math.min(i + rest/3, cnt);
            }
        }
        if(cnt == Integer.MAX_VALUE) {
            cnt = -1;
        }
    }
}
