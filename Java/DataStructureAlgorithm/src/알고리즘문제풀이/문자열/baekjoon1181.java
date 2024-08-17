package 알고리즘문제풀이.문자열;

import java.io.*;
import java.lang.*;
import java.util.*;

public class baekjoon1181 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder strBuilder = new StringBuilder();
    static int N, maxLength;
    static List<String>[] list = new ArrayList[51];


    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    static void input() throws IOException{
        for(int i=1; i<=50; i++){
            list[i] = new ArrayList<>();
        }
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            list[str.length()].add(str);
            maxLength = Math.max(str.length(), maxLength);
        }
    }

    static void execute(){
        String prevStr = "";
        for(int i=1; i<=maxLength; i++){
            if(list[i].size()>0){
                Collections.sort(list[i]);
                for(int j=0; j<list[i].size(); j++){
                    if(!list[i].get(j).equals(prevStr)) {
                        strBuilder.append(list[i].get(j) + "\n");
                        prevStr = list[i].get(j);
                    }
                }
            }
        }
    }

    static void output() {
        System.out.println(strBuilder.toString());
    }
}
