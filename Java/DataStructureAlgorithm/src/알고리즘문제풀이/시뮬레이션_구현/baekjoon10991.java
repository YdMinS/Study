package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon10991 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            StringBuilder strBuilder = new StringBuilder();
            int blankNum = N-i;
            strBuilder.append(" ".repeat(blankNum));
            strBuilder.append("* ".repeat(i));
            strBuilder.setLength(strBuilder.length()-1);
            strBuilder.append("\n");
            bw.write(strBuilder.toString());
        }
        bw.flush();
        bw.close();
    }
}
