package 알고리즘문제풀이.수학;

import java.io.*;
import java.util.*;

public class baekjoon2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        m += Integer.parseInt(br.readLine());
        if(m>=60){
            h += m/60;
            m = m%60;
        }
        if(h>=24){
            h = h%24;
        }
        System.out.println(h+" "+m);
    }
}
