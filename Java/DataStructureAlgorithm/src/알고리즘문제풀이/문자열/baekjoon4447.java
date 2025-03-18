package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon4447 {
    private static final String GOOD = " is GOOD";
    private static final String BAD = " is A BADDY";
    private static final String NEUTRAL = " is NEUTRAL";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String name = br.readLine();
            int gCnt = 0;
            int bCnt = 0;
            for(int j=0; j<name.length(); j++){
                char ch = name.charAt(j);
                if(ch == 'g' || ch == 'G') gCnt++;
                else if (ch == 'b' || ch == 'B') bCnt++;
                else continue;
            }
            bw.write(name + (gCnt==bCnt ? NEUTRAL : (gCnt > bCnt ? GOOD : BAD)));
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
