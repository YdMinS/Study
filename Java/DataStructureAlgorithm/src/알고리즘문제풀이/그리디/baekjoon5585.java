package 알고리즘문제풀이.그리디;

import java.io.*;
import java.lang.*;

public class baekjoon5585 {
    static int N, cnt=0;

    public static void main(String[] args) throws IOException{
        input();
        execuete();
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    private static void execuete(){
        int rest = 1000-N;
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};
        for(int i=0; i<coins.length; i++){
            if(rest/coins[i]!=0){
                cnt += rest/coins[i];
                rest %= coins[i];
            }
        }
    }
}
