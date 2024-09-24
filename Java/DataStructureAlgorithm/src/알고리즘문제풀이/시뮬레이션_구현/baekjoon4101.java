package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon4101 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a, b;
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0) break;
            System.out.println(a>b?"Yes":"No");
        }
    }
}
