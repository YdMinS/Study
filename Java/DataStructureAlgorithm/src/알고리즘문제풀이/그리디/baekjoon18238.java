package 알고리즘문제풀이.그리디;

import java.io.*;
import java.lang.*;

public class baekjoon18238 {
    static String str;
    static int ref = 0, time;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(time);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
    }

    private static void execute(){
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int target = c-'A';
            int forward = (target - ref + 26) % 26;
            int backward = (ref - target + 26) % 26;
            time += Math.min(forward,backward);
            ref = target;
        }
    }
}
