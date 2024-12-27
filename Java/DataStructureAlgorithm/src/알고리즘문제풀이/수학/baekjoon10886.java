package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon10886 {
    static final String CUTE = "Junhee is cute!";
    static final String NOT_CUTE = "Junhee is not cute!";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int score = 0;
        for(int i=0; i<N; i++){
            score += Integer.parseInt(br.readLine());
        }
        System.out.println(score>N/2 ? CUTE : NOT_CUTE);
    }
}
