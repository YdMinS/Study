package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon14659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int maxHeight = 0;
        int cnt = 0;
        int maxCnt = 0;

        for(int i=0; i<N; i++){
            int height = Integer.parseInt(st.nextToken());
            if (height > maxHeight) {
                maxHeight = height;
                maxCnt = Math.max(maxCnt, cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }

        maxCnt = Math.max(maxCnt, cnt);

        System.out.println(maxCnt);
    }
}
