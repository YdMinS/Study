package 알고리즘문제풀이.그리디;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon11034 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = br.readLine();
        while(!str.isEmpty()){
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            calculate(a, b, c);
            str = br.readLine();
        }
    }

    private static void calculate(int a, int b, int c){
        int dif1 = (int)Math.abs(a-b)-1;
        int dif2 = (int)Math.abs(b-c)-1;
        System.out.println(dif1>dif2 ? dif1 : dif2);
    }
}
