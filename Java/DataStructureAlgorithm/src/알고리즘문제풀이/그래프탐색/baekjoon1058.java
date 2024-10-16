package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.io.*;

public class baekjoon1058 {
    static int N;
    static int[][] graph;
    static int[][] friendNum;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N+1][N+1];
        friendNum = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                char c = str.charAt(j);
                if(c=='Y'){
                    graph[i][j+1] = 1;
                    graph[j+1][i] = 1;
                }
            }
        }
        br.close();
    }

    private static void execute() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                friendNum[i][j] = graph[i][j];
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                if (graph[i][j] == 1) {
                    friendNum[i][j] = 1;
                } else {
                    for (int k = 1; k <= N; k++) {
                        if (graph[i][k] == 1 && graph[k][j] == 1) {
                            friendNum[i][j] = 1;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void output(){
        int max = 0;
        for(int i=1; i<=N; i++){
            int cnt = 0;
            for(int j=1; j<=N; j++){
                if(i!=j && friendNum[i][j]>0){
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}
