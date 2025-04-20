package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon9295 {
    private static final String CASE = "Case %d: ";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;
            bw.write(String.format(CASE, i) + sum);
            if(i<N) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
