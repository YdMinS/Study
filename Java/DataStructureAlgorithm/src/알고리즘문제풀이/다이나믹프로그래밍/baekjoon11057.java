package 알고리즘문제풀이.다이나믹프로그래밍;

import java.io.IOException;
import java.util.Scanner;

public class baekjoon11057 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[][] dpGraph;

    static void input() throws IOException{
        N = sc.nextInt();
        dpGraph = new int[N+1][10];
        for(int i=0; i<10; i++){
            dpGraph[0][i] = 1;
        }
        for(int i=1; i<=N; i++){
            dpGraph[i][9] = 1;
        }
    }

    static int execute(){
        for(int i=1; i<=N; i++){
            for(int j=8; j>=0; j--){
                dpGraph[i][j] = (dpGraph[i-1][j] + dpGraph[i][j+1])%10007;
            }
        }
        return dpGraph[N][0];
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(execute());
    }
}
