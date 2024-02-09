package 알고리즘문제풀이.그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon2667 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, count;
    static char[][] map;
    static int[] varX = {1, 0, -1, 0};
    static int[] varY = {0, 1, 0, -1};
    static List<Integer> list = new ArrayList<>();

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = str.charAt(j);
            }
        }
    }

    static void execute(){
        int numOfDanji =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j]=='1'){
                    count=0;
                    dfs(i, j);
                    numOfDanji++;
                    list.add(count);
                    count=0;
                }
            }
        }
        System.out.println(numOfDanji);
    }

    static void dfs(int x, int y){
        if(map[x][y]=='0') return;

        count++;
        map[x][y] = '0';

        for(int i=0; i<4; i++){
            int newX = x + varX[i];
            int newY = y + varY[i];

            if(newX<0 || newY<0 || newX>=N || newY>=N) continue;
            if(map[newX][newY]=='0') continue;
            dfs(newX, newY);
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
        Collections.sort(list);
        for(int n : list){
            System.out.println(n);
        }
    }
}
