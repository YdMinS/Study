package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon30802 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] needsBySize = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<6; i++){
            needsBySize[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int bundleOfT = 0;
        for(int i=0; i<6; i++){
            int needs = needsBySize[i];
            if(needs==0) continue;
            bundleOfT += needs/T;
            bundleOfT += needs%T==0 ? 0 : 1;
        }
        bw.write(bundleOfT+"\n");
        bw.write(N/P+" "+N%P);
        bw.close();
    }
}
