package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon19532 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a, b, c, d, e, f, x, y;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(x+" "+y);
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

    }

    private static void execute() {
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a * i + b * j == c && d * i + e * j == f) {
                    x = i;
                    y = j;
                    return;
                }
            }
        }
    }
}
