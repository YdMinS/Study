package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon10179 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            double num = Double.parseDouble(br.readLine());
            bw.write(String.format("$%.2f\n", num*0.8));
        }
        bw.flush();
        bw.close();
    }
}
