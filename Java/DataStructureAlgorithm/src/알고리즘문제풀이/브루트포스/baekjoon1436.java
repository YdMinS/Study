package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;

public class baekjoon1436 {
    static int N, turn;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(turn);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    private static void execute(){
        int cnt = 0;
        int i=666;
        while(cnt < N){
            String str = new String(i+"");
            if(str.contains("666")){
                turn = i;
                cnt++;
            }
            i++;
        }
    }
}
