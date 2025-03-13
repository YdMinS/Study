package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon20528 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] S = br.readLine().split(" ");
        for(int i=0; i<N-1; i++){
            char back = S[i].charAt(S[i].length()-1);
            char front = S[i+1].charAt(0);
            if(back!=front){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
