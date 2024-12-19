package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon11945 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            StringBuilder sb = new StringBuilder(br.readLine());
            bw.write(sb.reverse()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
