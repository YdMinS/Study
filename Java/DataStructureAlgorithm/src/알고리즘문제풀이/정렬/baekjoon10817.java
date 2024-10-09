package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon10817 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] map = new int[3];
        for(int i=0; i<3; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(map);
        System.out.println(map[1]);
    }
}
