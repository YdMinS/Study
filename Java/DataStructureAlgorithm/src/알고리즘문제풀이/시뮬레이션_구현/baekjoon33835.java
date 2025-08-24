package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon33835 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long x1 = 0, y1 = 0, xN = 0, yN = 0;
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            if (i == 1) { x1 = x; y1 = y; }
            if (i == N) { xN = x; yN = y; }
        }

        double ans = Math.hypot((double)(xN - x1), (double)(yN - y1));
        System.out.printf("%.10f%n", ans);
    }
}
