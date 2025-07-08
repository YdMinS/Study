package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon10419 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            int t = Integer.parseInt(br.readLine());
            bw.write(findMaxTime(t)+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int findMaxTime(int t){
        int result = 0;
        for(int i=0; i<t; i++){
            int calculatedTime = i*i + i;
            if(calculatedTime<=t) result = i; else break;
        }
        return result;
    }
}
