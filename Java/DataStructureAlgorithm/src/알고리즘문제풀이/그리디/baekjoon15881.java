package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class baekjoon15881 {
    static String str;
    static int cnt=0;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        str = br.readLine();
    }

    public static void execute() {
        for(int i=0; i<str.length()-3; i++){
            if(str.charAt(i)=='p' && str.charAt(i+1)=='P' && str.charAt(i+2)=='A' && str.charAt(i+3)=='p'){
                cnt++;
                if(i+3<str.length()-3) {
                    i += 3;
                }
            }
        }
    }
}
