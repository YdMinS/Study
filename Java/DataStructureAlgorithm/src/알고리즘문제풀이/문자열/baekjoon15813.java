package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon15813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int score = 0;
        String name = br.readLine();
        for(int i=0; i<N; i++){
            char ch = name.charAt(i);
            score += ch - 'A' + 1;
        }
        System.out.print(score);
    }
}
