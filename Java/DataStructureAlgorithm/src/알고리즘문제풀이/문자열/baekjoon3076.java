package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon3076 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int R, C, x, y;
    private static String pattern1, pattern2;

    public static void main(String[] args) throws IOException{
        input();
        buildPattern();
        makeResultPattern();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
    }

    private static void buildPattern() {
        StringBuilder strBuilder1 = new StringBuilder();
        StringBuilder strBuilder2 = new StringBuilder();
        for(int i=0; i<C*y; i++){
            int rest = i/y;
            strBuilder1.append(rest%2==0 ? "X" : ".");
            strBuilder2.append(rest%2==0 ? "." : "X");
        }
        pattern1 = strBuilder1.toString();
        pattern2 = strBuilder2.toString();
    }

    private static void makeResultPattern() throws IOException {
        for(int i=0; i<R*x; i++){
            int rest = i/x;
            if(rest%2==0){
                bw.write(pattern1);
            } else {
                bw.write(pattern2);
            }
            if(i<R*x-1) bw.newLine();
        }
    }
}
