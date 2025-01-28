package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon17201 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String blockChain = br.readLine();
        int LAST = blockChain.charAt(0) == '1' ? 2 : 1;
        for(int i=0; i<N; i++){
            char first = blockChain.charAt(i*2);
            char last = blockChain.charAt(i*2+1);
            if(first == LAST){
                System.out.println("No");
                return;
            }
            LAST = last;
        }
        System.out.println("Yes");
    }
}
