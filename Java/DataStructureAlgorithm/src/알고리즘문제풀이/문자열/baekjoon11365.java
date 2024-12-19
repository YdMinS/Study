package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon11365 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());
        while(!sb.toString().equals("END")){
            bw.write(sb.reverse()+"\n");
            sb = new StringBuilder(br.readLine());
        }
        bw.flush();
        bw.close();
    }
}
