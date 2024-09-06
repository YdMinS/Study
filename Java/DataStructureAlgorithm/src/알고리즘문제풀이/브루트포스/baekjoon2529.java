package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;

public class baekjoon2529 {
    static int N;
    static String min, max;
    static boolean minIsFound;
    static String[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = br.readLine().split(" ");
    }

    private static void execute(){
        visited = new boolean[10];
        for(int i=0; i<10; i++){
            visited[i] = true;
            dfs(i, 0, i+"");
            visited[i] = false;
        }
    }

    private static void dfs(int currentNode, int depth, String num){
        if(depth == N){
            if(!minIsFound){
                min = num;
                minIsFound = true;
            }
            max = num;
            return;
        }
        for(int i=0; i<10; i++){
            if(visited[i]) continue;
            boolean isAcceptable = false;
            if(map[depth].equals(">") && currentNode>i){
                isAcceptable = true;
            } else if(map[depth].equals("<") && currentNode<i){
                isAcceptable = true;
            }
            if(isAcceptable) {
                visited[i] = true;
                dfs(i, depth + 1, num+i);
                visited[i] = false;
            }
        }
    }

    private static void output(){
        System.out.println(max+"\n"+min);
    }
}