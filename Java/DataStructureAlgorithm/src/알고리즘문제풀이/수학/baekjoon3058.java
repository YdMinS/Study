package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon3058 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            int min = Integer.MAX_VALUE;
            while(st.hasMoreTokens()){
                int n = Integer.parseInt(st.nextToken());
                if(n%2 == 0){
                    sum += n;
                    min = Math.min(min, n);
                }
            }
            bw.write(sum + " " + min + "\n");
        }
        bw.flush();
        bw.close();
    }
}
