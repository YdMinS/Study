package 알고리즘문제풀이.데이터구조;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11866 {
    static int N, K;
    static List<Integer> list = new ArrayList<>();
    static StringBuilder stringBuilder = new StringBuilder();
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(stringBuilder);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        for(int i=1; i<=N; i++){
            list.add(i);
        }
    }

    private static void execute(){
        stringBuilder.append("<");
        int index = 0;
        while(list.size()>1){
            index = (index + K - 1) % list.size();
            int num = list.get(index);
            if(visited[num]) break;
            visited[num] = true;
            list.remove(index);
            stringBuilder.append(num).append(", ");
        }
        stringBuilder.append(list.get(0));
        stringBuilder.append(">");
    }
}
