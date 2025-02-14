package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon18406 {
    private static final String LUCKY = "LUCKY";
    private static final String READY = "READY";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numInput = br.readLine();
        int sum = 0;
        for(int i=0; i<numInput.length()/2; i++){
            sum += Character.getNumericValue(numInput.charAt(i));
            sum -= Character.getNumericValue(numInput.charAt(numInput.length()-1-i));
        }
        System.out.println(sum==0 ? LUCKY : READY);
    }
}
