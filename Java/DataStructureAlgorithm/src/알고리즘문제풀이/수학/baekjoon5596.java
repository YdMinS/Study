package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon5596 {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int S = 0;
        int T = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            S += Integer.parseInt(st1.nextToken());
            T += Integer.parseInt(st2.nextToken());
        }
        System.out.print(Math.max(S, T));
    }
}
