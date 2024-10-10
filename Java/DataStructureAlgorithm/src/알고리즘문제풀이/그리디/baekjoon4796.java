package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon4796 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int i = 1;
        while(a!=0 && b!=0 && c!=0){
            int cnt = a * (c/b);
            int d = c % b;
            if(d>=a){
                cnt+=a;
            } else {
                cnt+=d;
            }
            bw.append(String.format("Case %d: %d\n", i, cnt));
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            i++;
        }
        bw.flush();
        bw.close();
    }
}
