package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon30045 {
    static final String REF1 = "01";
    static final String REF2 = "OI";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.contains(REF1) || str.contains(REF2)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
