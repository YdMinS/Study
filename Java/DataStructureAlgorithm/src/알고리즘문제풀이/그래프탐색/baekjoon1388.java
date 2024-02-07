package 알고리즘문제풀이.그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1388 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, numOfWood;
    static char[][] map;
    static boolean[][] visited;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j);
            }
        }
    }

    static void execute() {
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!visited[i][j]){
                    char ch = map[i][j];
                    numOfWood++;
                    dfs(i, j, ch);
                }
            }
        }
    }

    static void dfs(int i, int j, char ch){
        if(ch != map[i][j]) {
            return;
        } else {
            visited[i][j] = true;
            if(ch == '-' && j+1<M){
                dfs(i, j+1, ch);
            }
            if(ch == '|' && i+1<N) {
                dfs(i+1, j, ch);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(numOfWood);
    }
}
