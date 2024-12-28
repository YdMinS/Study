package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon10992 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int lastStar = 2*N-1;
        for(int i=1; i<=N; i++){
            StringBuilder strBuilder = new StringBuilder();
            if(i==N){
                strBuilder.append("*".repeat(lastStar));
            } else {
                int frontBlankNum = N-i;
                strBuilder.append(" ".repeat(frontBlankNum));
                strBuilder.append("*");
                int middleBlankNum = 2*(i-1)-1;
                if(middleBlankNum>0){
                    strBuilder.append(" ".repeat(middleBlankNum));
                    strBuilder.append("*");
                }
                strBuilder.append("\n");
            }
            bw.write(strBuilder.toString());
        }
        bw.flush();
        bw.close();
    }
}
