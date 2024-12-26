package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31867 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int oddNum = 0;
        int evenNum = 0;
        String num = br.readLine();
        for(int i=0; i<N; i++){
            int ch = Character.getNumericValue(num.charAt(i));
            if(ch%2==0){
                evenNum++;
            } else {
                oddNum++;
            }
        }
        if(evenNum>oddNum){
            System.out.println(0);
        } else if(evenNum<oddNum){
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
