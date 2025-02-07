package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon25501 {
    private static final int PALINDROME = 1;
    private static final int NOT_PALINDROME = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int cnt = 0;
            boolean isPalindrome = true;
            String str = br.readLine();
            int callNum = str.length()/2;
            for(int j=0; j<callNum; j++){
                char frontCh = str.charAt(j);
                char backCh = str.charAt(str.length()-1-j);
                cnt++;
                if(frontCh != backCh) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome) cnt++;
            bw.write((isPalindrome ? PALINDROME : NOT_PALINDROME)+" "+cnt+(i<N-1 ? "\n" : ""));
        }
        bw.flush();
        bw.close();
    }
}
