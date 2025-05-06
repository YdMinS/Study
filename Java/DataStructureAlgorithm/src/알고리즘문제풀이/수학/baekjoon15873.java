package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon15873 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int a, b;
        if(input.length() >= 3){
            int index = input.charAt(1)=='0' ? 2 : 1;
            a = Integer.parseInt(input.substring(0, index));
            b = Integer.parseInt(input.substring(index));
        } else {
            a = Character.getNumericValue(input.charAt(0));
            b = Character.getNumericValue(input.charAt(1));
        }
        System.out.print(a+b);
    }
}
