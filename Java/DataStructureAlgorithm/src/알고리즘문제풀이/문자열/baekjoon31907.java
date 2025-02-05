package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31907 {
    private static final String[][] printSource = {
            {"G", ".", ".", "."},
            {".", "I", ".", "T"},
            {".", ".", "S", "."}
    };

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<printSource.length; i++){
            StringBuilder row = new StringBuilder();
            for(int j=0; j<printSource[i].length; j++){
                row.append(printSource[i][j].repeat(N));
            }
            for(int j=0; j<N; j++){
                bw.write(row.toString() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
