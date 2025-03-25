package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon24510 {
    private static final String FOR = "for";
    private static final String WHILE = "while";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int cnt = 0;
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == 'f' && j+3<= str.length() && FOR.equals(str.substring(j, j+3))) {
                    j += 2;
                    cnt++;
                } else if (ch == 'w' && j+5 <= str.length() && WHILE.equals(str.substring(j, j+5))) {
                    j += 4;
                    cnt++;
                }
            }
            max = Math.max(cnt, max);
        }
        System.out.print(max);
    }
}
