package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon30402 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<15; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String str = st.nextToken();
                switch(str){
                    case "w":
                        System.out.println("chunbae");
                        return;
                    case "b":
                        System.out.println("nabi");
                        return;
                    case "g":
                        System.out.println("yeongcheol");
                        return;
                }
            }
        }
    }
}
