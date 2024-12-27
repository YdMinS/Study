package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon2742 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=N; i>0; i--){
            bw.write(i+(i!=1 ? "\n" : ""));
        }
        bw.flush();
        bw.close();
    }
}
