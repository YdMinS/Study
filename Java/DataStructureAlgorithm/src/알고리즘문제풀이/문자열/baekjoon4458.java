package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon4458 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            String firstLetter = str.substring(0,1).toUpperCase();
            bw.write(firstLetter);
            bw.write(str.substring(1)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
