package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5026 {
    private static final String SKIP = "skipped";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int index = str.indexOf('+');
            if(index == -1) {
                bw.write(SKIP);
            } else {
                int a = Integer.parseInt(str.substring(0, index));
                int b = Integer.parseInt(str.substring(index+1));
                bw.write(String.valueOf(a + b));
            }
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
