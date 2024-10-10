package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;

public class baekjoon2810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cupHolder = 1;
        boolean isL = false;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='L'){
                if(!isL){
                    cupHolder++;
                    isL=true;
                } else {
                    isL = false;
                }
            } else {
                cupHolder++;
            }
        }
        System.out.println(cupHolder>=N ? N : cupHolder);
    }
}
