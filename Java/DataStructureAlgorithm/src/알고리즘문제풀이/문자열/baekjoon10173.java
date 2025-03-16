package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon10173 {
    private static final String NEMO = "nemo";
    private static final String FOUND = "Found";
    private static final String NOT_FOUND = "Missing";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals("EOI")){
            bw.write(str.toLowerCase().contains(NEMO) ? FOUND : NOT_FOUND);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
