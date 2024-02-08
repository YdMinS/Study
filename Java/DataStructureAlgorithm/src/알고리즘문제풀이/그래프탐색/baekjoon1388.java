package 알고리즘문제풀이.그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon1388 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
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

    static int execute() {
        int numOfWood = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!visited[i][j]){
                    char ch = map[i][j];
                    numOfWood++;
                    dfs(i, j, ch);
                }
            }
        }

        return numOfWood;
    }

    static void dfs(int i, int j, char ch){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});

        while(!stack.isEmpty()){
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            if(x<0 || y<0 || x>=N || y>=M|| visited[x][y] || map[x][y]!=ch) continue;

            visited[x][y] = true;

            if(ch=='-' && y+1 <M){
                stack.push(new int[]{x, y+1});
            }
            if(ch=='|' && x+1 <N){
                stack.push(new int[]{x+1, y});
            }
        }
    }

//    static void dfs(int i, int j, char ch){
//        if(ch != map[i][j]) {
//            return;
//        } else {
//            visited[i][j] = true;
//            if(ch == '-' && j+1<M){
//                dfs(i, j+1, ch);
//            }
//            if(ch == '|' && i+1<N) {
//                dfs(i+1, j, ch);
//            }
//        }
//    }

    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        input();
        System.out.println(execute());
        System.out.println("Execution Time : "+(System.currentTimeMillis()-start));
    }
}
