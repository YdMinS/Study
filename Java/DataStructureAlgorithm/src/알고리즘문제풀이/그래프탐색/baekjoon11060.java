package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon11060 {
    static int N;
    static int[] map, dist;

    public static void main(String[] args) throws IOException{
        input();
        int result = bfs();
        System.out.println(result);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new int[N+1];
        dist = new int[N+1];
        Arrays.fill(dist, -1);
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static int bfs() {
        Queue<Integer> q = new LinkedList();
        q.offer(1);
        dist[1] = 0;

        while(!q.isEmpty()){
            int currentNode = q.poll();

            if(currentNode == N){
                return dist[currentNode];
            }

            for(int i=1; i<=map[currentNode]; i++){
                int nextNode = currentNode + i;
                if(nextNode<=N && dist[nextNode]==-1){
                    dist[nextNode] = dist[currentNode]+1;
                    q.offer(nextNode);
                }
            }

        }
        return -1;
    }
}
