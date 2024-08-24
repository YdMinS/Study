package 알고리즘문제풀이.시뮬레이션_구현;

import java.lang.*;
import java.io.*;

public class baekjoon2290 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder str = new StringBuilder();
    static int s;
    static String n;
    static String[] hStr, vStr;
    static int[][] map = new int[5][10];

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        String[] str = br.readLine().split(" ");
        s = Integer.parseInt(str[0]);
        n = str[1];
        hStr = new String[]{" ".repeat(s+2), " "+"-".repeat(s)+" "};
        vStr = new String[]{" ".repeat(s+1)+"|", "|"+" ".repeat(s)+"|", "|"+" ".repeat(s+1)};
        map[0] = new int[]{1, 0, 1, 1, 0, 1, 1, 1, 1, 1};
        map[1] = new int[]{1, 0, 0, 0, 1, 2, 2, 0, 1, 1};
        map[2] = new int[]{0, 0, 1, 1, 1, 1, 1, 0, 1, 1};
        map[3] = new int[]{1, 0, 2, 0, 0, 0, 1, 0, 1, 0};
        map[4] = new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1};
    }

    private static void execute() {
        for(int i=0; i<5; i++) {
            for (int j=0; j<n.length(); j++) {
                int num = Character.getNumericValue(n.charAt(j));
                if(i%2==0) {
                    str.append(hStr[map[i][num]] + " ");
                } else {
                    str.append(vStr[map[i][num]] + " ");

                }
            }
            if(i%2==1) {
                for(int k=0; k<s; k++){
                    System.out.println(str.toString());
                }
            } else {
                System.out.println(str.toString());
            }
            str.setLength(0);
        }
    }
}
