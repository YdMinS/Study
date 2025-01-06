package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon10102 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        String votes = br.readLine();
        for(int i=0; i<votes.length(); i++){
            char ch = votes.charAt(i);
            switch (ch){
                case 'A':
                    A++;
                    break;
                case 'B':
                    B++;
            }
        }
        if(A!=B){
            System.out.println(A>B ? "A" : "B");
        } else {
            System.out.println("Tie");
        }
    }
}
