package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon32342 {
    static final String WOW = "WOW";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int cnt = 0;
            String stream = br.readLine();
            for(int j=0; j<stream.length()-2; j++){
                String parsedStream = stream.substring(j, j+3);
                if(parsedStream.equals(WOW)){
                    cnt++;
                }
            }
            bw.write(cnt + (i<N-1 ? "\n" : ""));
        }
        bw.flush();
        bw.close();
    }
}
