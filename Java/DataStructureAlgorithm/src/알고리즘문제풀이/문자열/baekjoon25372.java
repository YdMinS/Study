package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;

public class baekjoon25372 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.length()>=6 && str.length()<=9){
                bw.append("yes\n");
            }else {
                bw.append("no\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
