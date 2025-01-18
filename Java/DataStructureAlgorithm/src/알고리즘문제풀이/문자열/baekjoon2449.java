package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon2449 {
    static final String MESSAGE = "Hamming distance is ";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str1 = br.readLine();
            String str2 = br.readLine();
            int cnt = 0;
            for(int j=0; j<str1.length(); j++){
                char ch1 = str1.charAt(j);
                char ch2 = str2.charAt(j);
                if(ch1 != ch2) cnt++;
            }
            bw.write(MESSAGE+cnt+".\n");
        }
        bw.close();
    }
}
