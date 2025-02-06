package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon1100 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfF = 0;
        for(int i=0; i<8; i++){
            String chaseInfo = br.readLine();
            for(int j=0; j<8; j++){
                if(i%2==j%2){
                    if(chaseInfo.charAt(j)=='F') numOfF++;
                    j++;
                }
            }
        }
        System.out.println(numOfF);
    }
}
