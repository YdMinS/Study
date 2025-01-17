package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5789 {
    static final String DO = "Do-it";
    static final String DO_NOT = "Do-it-Not";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            char frontCh = str.charAt(str.length()/2-1);
            char backCh = str.charAt(str.length()/2);
            bw.write(frontCh == backCh ? DO : DO_NOT);
            if(i!=N-1) bw.write("\n");
        }
        bw.close();
    }
}
