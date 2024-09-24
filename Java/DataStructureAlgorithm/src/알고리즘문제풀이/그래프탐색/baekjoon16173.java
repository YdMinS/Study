package 알고리즘문제풀이.그래프탐색;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon16173 {
    static int N;
    static boolean isSuccess = false;
    static int[][] map;

    public static void main(String[] args) throws IOException{
        input();
        play(0,0);
        if(isSuccess){
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void play(int x, int y){
        int num = map[x][y];
        if(num==-1){
            isSuccess = true;
            return;
        }
        if(num==0){
            return;
        }
        Stack<int[]> stack = new Stack<>();
        if(x+num<N){
            stack.add(new int[]{x+num, y});
        }
        if(y+num<N){
            stack.add(new int[]{x, y+num});
        }
        while(!stack.isEmpty() && !isSuccess){
            int[] nextPlay = stack.pop();
            int nX = nextPlay[0];
            int nY = nextPlay[1];
            play(nX, nY);
        }
    }
}
