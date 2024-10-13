package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;

public class baekjoon4999 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        if(a.length()>=b.length()){
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
