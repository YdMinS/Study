package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon28256 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            readGraph();
            List<Integer> result = searchGraph();
            bw.write(evaluateGraph(result) ? "1\n" : "0\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static void readGraph() throws IOException{
        graph = new int[3][3];
        for(int i=0; i<3; i++){
            String str = br.readLine();
            for(int j=0; j<3; j++){
                graph[i][j] = str.charAt(j)=='O' ? 1 : 0;
            }
        }
    }

    private static List<Integer> searchGraph(){
        List<Integer> result = new ArrayList<>();
        visited = new boolean[3][3];
        visited[1][1] = true;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(!visited[i][j]){
                    visited[i][j] = true;
                    if(graph[i][j]!=0){
                        cnt = 1;
                        dfs(i, j);
                        result.add(cnt);
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    private static void dfs(int x, int y){
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<3 && ny<3 && !visited[nx][ny]){
                if(graph[nx][ny]==1){
                    cnt++;
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }

    private static boolean evaluateGraph(List<Integer> result) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        if(result.size() == n){
            List<Integer> checkList = new ArrayList<>();
            for(int j=0; j<n; j++){
                checkList.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(checkList);
            return result.equals(checkList);
        } else {
            return false;
        }
    }
}
