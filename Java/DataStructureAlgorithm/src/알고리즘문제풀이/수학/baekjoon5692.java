package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon5692 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        while(!(num = br.readLine()).equals("0")){
            long result = 0;
            int pactorial = 1;
            for(int i = 1; i<=num.length(); i++){
                pactorial *= i;
                int n = Character.getNumericValue(num.charAt(num.length()-i));
                result += (long) pactorial * n;
            }
            System.out.println(result);
        }
    }
}
