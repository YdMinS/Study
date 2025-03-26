package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon23813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String currentN = N;
        long result = 0;
        for(int i=0; i<N.length(); i++){
            currentN = rotate(currentN);
            result += Long.parseLong(currentN);
            if(N.equals(currentN)) {
                break;
            }
        }
        System.out.print(result);
    }

    private static String rotate(String N){
        return N.charAt(N.length()-1) + N.substring(0, N.length()-1);
    }
}
