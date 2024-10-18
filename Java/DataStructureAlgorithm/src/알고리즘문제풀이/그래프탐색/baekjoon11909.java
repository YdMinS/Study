package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon11909 {
    static int N;
    static int[][] graph;
    static int[] dx = {-1, 0};
    static int[] dy = {0, -1};

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(search());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static int search() {
        int[][] visited = new int[N][N];
        for(int i=0; i<N; i++){
            Arrays.fill(visited[i], Integer.MAX_VALUE);
        }
        visited[0][0] = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<2; k++){
                    int preX = i + dx[k];
                    int preY = j + dy[k];
                    if(preX>=0 && preY>=0 && preX<N && preY<N){
                        if(graph[preX][preY] > graph[i][j]){
                            visited[i][j] = Math.min(visited[i][j], visited[preX][preY]);
                        } else {
                            int newCost = visited[preX][preY] + 1 + graph[i][j] - graph[preX][preY];
                            visited[i][j] = Math.min(visited[i][j], newCost);
                        }
                    }
                }
            }
        }
        return visited[N-1][N-1];
    }
}
