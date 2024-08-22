package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon1764 {
    static int N, M;
    static Map<String, Integer> unheard = new HashMap<>();
    static List<String> nothing = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            unheard.put(br.readLine(), 1);
        }
        for(int i=0; i<M; i++){
            String unseen = br.readLine();
            if(unheard.containsKey(unseen)){
                nothing.add(unseen);
            }
        }
    }

    private static void output(){
        System.out.println(nothing.size());
        Collections.sort(nothing);
        for(String str : nothing){
            System.out.println(str);
        }
    }
}
