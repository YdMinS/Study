package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon20168 {
    static int N, M, startNode, endNode, C, maxPrice=Integer.MIN_VALUE;
    static List<Edge>[] paths;

    static class Edge{
        int to;
        int price;

        public Edge(int to, int price){
            this.to = to;
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        int result = binarySearch();
        System.out.println(result == -1 ? -1 : result);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        endNode = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        paths = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            paths[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            paths[a].add(new Edge(b, price));
            paths[b].add(new Edge(a, price));
            maxPrice = Math.max(maxPrice, price);
        }
    }

    private static int binarySearch(){
        int left = 0, right = maxPrice;
        int result = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(dfs(startNode, 0, mid, new boolean[N+1])){
                result = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return result;
    }

    private static boolean dfs(int currentNode, int totalPrice, int maxHumiliated, boolean[] visited){
        if(totalPrice>C) return false;
        if(currentNode==endNode) return true;

        visited[currentNode]=true;

        for(Edge edge : paths[currentNode]){
            if(!visited[edge.to] && edge.price<=maxHumiliated){
                if(dfs(edge.to, totalPrice+edge.price, maxHumiliated, visited)){
                    visited[currentNode] = false;
                    return true;
                }
            }
        }

        visited[currentNode] = false;
        return false;
    }
}
