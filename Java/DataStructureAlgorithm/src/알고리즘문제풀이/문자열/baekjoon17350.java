package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon17350 {
    static final String ANJ = "anj";
    static final String POSITIVE_ANSWER = "뭐야;";
    static final String NEGATIVE_ANSWER = "뭐야?";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.equals(ANJ)){
                System.out.println(POSITIVE_ANSWER);
                return;
            }
        }
        System.out.println(NEGATIVE_ANSWER);
    }
}
