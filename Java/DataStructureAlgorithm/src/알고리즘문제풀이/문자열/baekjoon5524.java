package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5524 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            bw.write(br.readLine().toLowerCase()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
