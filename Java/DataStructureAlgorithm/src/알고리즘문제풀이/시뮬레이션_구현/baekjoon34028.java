package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon34028 {
    private static final int[] DEBUIT= new int[]{2015, 1, 16};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] today = new int[3];
        for(int i=0; i<3; i++){
            today[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 1;
        int years = today[0] - DEBUIT[0];
        cnt += 4 * years;
        if (today[1] >= 12) cnt += 4;
        else if (today[1] >= 9) cnt += 3;
        else if (today[1] >= 6) cnt += 2;
        else if (today[1] >= 3) cnt += 1;

        System.out.println(cnt);
    }
}
