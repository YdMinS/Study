package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon14928 {
    private static final int BIRTHDAY = 20000303;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bigNumber = br.readLine();

        int result = 0;
        for(int i=0; i<bigNumber.length(); i++){
            result = (result * 10 + (bigNumber.charAt(i) - '0')) % BIRTHDAY;
        }

        System.out.print(result);
    }
}
