package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon4485 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N = -1, caseNum = 1;
    static int[][] graph, dp;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        while(N!=0){
            input();
            execute();
            N = Integer.parseInt(br.readLine());
            caseNum++;
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        StringTokenizer st;
        graph = new int[N][N];
        dp = new int[N][N];
        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void execute() throws IOException {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[2], b[2]));
        dp[0][0] = graph[0][0];
        pq.offer(new int[]{0, 0, dp[0][0]});
        while(!pq.isEmpty()){
            int[] currentNode = pq.poll();
            int x = currentNode[0];
            int y = currentNode[1];
            int lostRuppe = currentNode[2];
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<N){
                    int newLostRuppe = lostRuppe + graph[nx][ny];
                    if(newLostRuppe < dp[nx][ny]){
                        dp[nx][ny] = newLostRuppe;
                        pq.offer(new int[]{nx, ny, newLostRuppe});
                    }
                }
            }
        }
        bw.write(String.format("Problem %d: %d\n", caseNum, dp[N-1][N-1]));
    }
}
