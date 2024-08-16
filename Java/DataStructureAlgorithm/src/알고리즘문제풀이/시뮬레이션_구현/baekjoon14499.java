package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon14499 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, x, y, roll;
    static int[][] map;
    static int[] direction, dice;

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        roll = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        direction = new int[roll];
        dice = new int[6];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<roll; i++){
            direction[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute(){
        for(int i=0; i<direction.length; i++){
            if(rollable(direction[i])) {
                rotate(direction[i]);
                calculate();
                System.out.println(dice[0]);
            }
        }
    }

    static boolean rollable(int direction){
        switch(direction){
            case 1:
                if(y==M-1) return false;
                break;
            case 2:
                if(y==0) return false;
                break;
            case 3:
                if(x==0) return false;
                break;
            case 4:
                if(x==N-1) return false;
        }
        return true;
    }

    static void rotate(int direction) {
        switch(direction){
            case 1:
                toEast();
                break;
            case 2:
                toWest();
                break;
            case 3:
                toNorth();
                break;
            case 4:
                toSouth();
                break;
        }
    }

    static void calculate(){
        if(map[x][y]==0){
            map[x][y] = dice[1];
        } else {
            dice[1] = map[x][y];
            map[x][y] = 0;
        }
    }

    static void toEast(){
        int top = dice[0];
        int bottom = dice[1];
        int west = dice[4];
        int east = dice[5];
        dice[0] = west;
        dice[1] = east;
        dice[4] = bottom;
        dice[5] = top;
        y++;
    }

    static void toWest(){
        int top = dice[0];
        int bottom = dice[1];
        int west = dice[4];
        int east = dice[5];
        dice[0] = east;
        dice[1] = west;
        dice[4] = top;
        dice[5] = bottom;
        y--;
    }

    static void toNorth(){
        int top = dice[0];
        int bottom = dice[1];
        int north = dice[2];
        int south = dice[3];
        dice[0] = south;
        dice[1] = north;
        dice[2] = top;
        dice[3] = bottom;
        x--;
    }

    static void toSouth(){
        int top = dice[0];
        int bottom = dice[1];
        int north = dice[2];
        int south = dice[3];
        dice[0] = north;
        dice[1] = south;
        dice[2] = bottom;
        dice[3] = top;
        x++;
    }
}
