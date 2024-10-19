package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1326 {
    static int N, startNode, endNode;
    static int[] map;
    static int[] distance;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N+1];
        distance = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            map[i] = Integer.parseInt(st.nextToken());
            distance[i] = -1;
        }
        st = new StringTokenizer(br.readLine());
        startNode = Integer.parseInt(st.nextToken());
        endNode = Integer.parseInt(st.nextToken());
    }

    private static int execute(){
        Queue<Integer> q = new LinkedList();
        q.offer(startNode);
        distance[startNode] = 0;

        while(!q.isEmpty()){
            int currentNode = q.poll();
            if (currentNode == endNode) {
                return distance[endNode];
            }
            for(int i=1; i<=N; i++){
                int nextNode = currentNode + i * map[currentNode];
                if(nextNode<=N && distance[nextNode]==-1){
                    q.offer(nextNode);
                    distance[nextNode] = distance[currentNode]+1;
                }
                nextNode = currentNode - i * map[currentNode];
                if(nextNode>0 && distance[nextNode]==-1){
                    q.offer(nextNode);
                    distance[nextNode] = distance[currentNode]+1;
                }
            }
        }
        return -1;
    }
}

