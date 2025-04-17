package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon5717 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a, b;
        while((a=Integer.parseInt(st.nextToken()))!=0 && (b=Integer.parseInt(st.nextToken()))!=0){
            bw.write(a+b+"");
            bw.newLine();
            st = new StringTokenizer(br.readLine());
        }
        bw.flush();
        bw.close();
    }
}
