package 알고리즘문제풀이.문자열;

import java.io.*;
import java.util.*;

public class baekjoon18312 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String K = st.nextToken();
        int h = 0, m = 0, s = 0;
        int result = 0;
        while(true){
            String H = h<10 ? "0"+h : String.valueOf(h);
            String M = m<10 ? "0"+m : String.valueOf(m);
            String S = s<10 ? "0"+s : String.valueOf(s);
            if(H.contains(K) || M.contains(K) || S.contains(K)) result++;
            if(h==N && m == 59 && s==59) break;
            s++;
            if(s==60){
                m++;
                s=0;
            }
            if(m==60){
                h++;
                m=0;
            }
        }
        System.out.println(result);
    }
}
