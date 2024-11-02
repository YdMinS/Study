package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon21316 {
    static List<Integer>[] graph = new ArrayList[13];
    static {
        for(int i=1; i<=12; i++){
            graph[i] = new ArrayList();
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<12; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
    }

    private static int execute(){
        boolean[] isSpica;
        int result = 0;
        for(int i=1; i<=12; i++){
            boolean isRealSpica = false;
            isSpica = new boolean[4];
            if(graph[i].size()==3){
                isRealSpica = true;
                isSpica[0] = true;
                for(int j : graph[i]){
                    int index = graph[j].size();
                    if(!isSpica[index]){
                        isSpica[index] = true;
                    } else {
                        isRealSpica = false;
                        break;
                    }
                }
            }
            if(isRealSpica){
                result = i;
                return result;
            }
        }
        return result;
    }
}
