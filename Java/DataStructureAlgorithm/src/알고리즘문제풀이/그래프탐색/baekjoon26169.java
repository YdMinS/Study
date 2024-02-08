package 알고리즘문제풀이.그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon26169 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] map = new int[5][5];
    static int x, y, numOfApple;
    static int[][] var = {{1,0}, {0,1}, {-1,0}, {0,-1}};

    static void input() throws IOException{
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
    }

    static boolean execute(){
        boolean[][] visited = new boolean[5][5];
        int depth = 0;
        visited[x][y] = true;
        if(map[x][y] == -1) return false;
        numOfApple += map[x][y]==1 ? 1 : 0;

        dfs(x, y, depth, visited);

        if(numOfApple>=2){
            return true;
        } else {
            return false;
        }
    }

    static void dfs(int x, int y, int depth, boolean[][] visited){
        if(numOfApple>=2 || depth == 3) return;

        for(int i=0 ; i<4; i++){
            int newX = x + var[i][0];
            int newY = y + var[i][1];

            if(newX <0 || newY <0 || newX >=5 || newY >=5) continue;
            if(visited[newX][newY]) continue;
            if(map[newX][newY] == -1) continue;

            depth++;
            visited[newX][newY] = true;
            if(map[newX][newY]==1) numOfApple++;
            dfs(newX, newY, depth, visited);
            if(numOfApple<2) {
                visited[newX][newY] = false;
                depth--;
                numOfApple -= map[newX][newY] == 1 ? 1 : 0;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        if(execute()){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
