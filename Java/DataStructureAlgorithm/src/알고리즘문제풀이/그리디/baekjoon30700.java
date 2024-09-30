package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class baekjoon30700 {
    static int cnt=0;
    static String str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        execute();
        System.out.println(cnt);
    }

    private static void execute(){
        String ref = "KOREA";
        int findingIndex = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c==ref.charAt(findingIndex)){
                findingIndex = (findingIndex+1)%5;
                cnt++;
            }
        }
    }
}
