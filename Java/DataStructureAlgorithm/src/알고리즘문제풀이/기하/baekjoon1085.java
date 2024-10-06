package 알고리즘문제풀이.기하;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon1085 {
    static int x, y, w, h;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
    }

    private static int execute(){
        int a = Math.min(x, w-x);
        int b = Math.min(y, h-y);
        return Math.min(a, b);
    }
}
