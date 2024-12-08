package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekoon5014 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int[] visited= new int[F+1];
        Arrays.fill(visited, -1);
        Queue<Integer> q = new LinkedList();
        q.offer(S);
        visited[S] = 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++){
                int current = q.poll();
                if(current==G){
                    System.out.println(visited[current]);
                    return;
                }
                if(current+U<=F && visited[current+U]==-1){
                    q.offer(current+U);
                    visited[current+U] = visited[current] + 1;
                }
                if(current-D>=1 && visited[current-D]==-1){
                    q.offer(current-D);
                    visited[current-D] = visited[current] + 1;
                }
            }
        }
        System.out.println("use the stairs");
    }
}
