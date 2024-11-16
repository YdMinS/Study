package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon2246 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N, cnt=0;
        N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            map[i][0] = D;
            map[i][1] = C;
        }
        for(int i=0; i<N; i++){
            int currentD = map[i][0];
            int currentC = map[i][1];
            boolean isCandidate = true;
            for(int j=0; j<N; j++){
                if(i==j) continue;
                int targetD = map[j][0];
                int targetC = map[j][1];
                if ((targetD < currentD && targetC <= currentC) ||
                        (targetC < currentC && targetD <= currentD)) {
                    isCandidate = false;
                    break;
                }
            }
            cnt += isCandidate ? 1 : 0;
        }
        System.out.println(cnt);
    }
}
