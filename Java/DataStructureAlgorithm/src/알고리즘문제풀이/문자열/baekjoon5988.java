package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int num = Character.getNumericValue(str.charAt(str.length()-1));
            System.out.println(num%2==0 ? "even" : "odd");
        }
    }
}
