package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class beakjoon11047 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, K, cnt=0;
    static int[] map;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        String[] NK = br.readLine().split(" ");
        N = Integer.parseInt(NK[0]);
        K = Integer.parseInt(NK[1]);
        map = new int[N];
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void execute(){
        int rest = K;
        while(rest>0) {
            for (int i = N-1; i>=0; i--){
                if(map[i]>K) continue;
                cnt += rest/map[i];
                rest = rest%map[i];
            }
        }
    }
}
