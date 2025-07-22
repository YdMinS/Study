package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon2160 {
    private static int N;
    private static char[][][] paint;
    private static int min = Integer.MAX_VALUE;
    private static int i,j;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(i+" "+j);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paint = new char[N][5][7];
        for(int i=0; i<N; i++){
            for(int j=0; j<5; j++){
                String input = br.readLine();
                for(int k=0; k<input.length(); k++){
                    paint[i][j][k] = input.charAt(k);
                }
            }
        }
    }

    private static void execute() {
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                compare(i, j);
            }
        }
    }

    private static void compare(int A, int B){
        int diff = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<7; j++){
                if(paint[A][i][j] != paint[B][i][j]) diff++;
                if(diff > min) return;
            }
        }
        min = diff;
        i = A+1;
        j = B+1;
    }
}
