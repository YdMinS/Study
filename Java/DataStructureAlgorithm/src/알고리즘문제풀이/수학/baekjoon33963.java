package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon33963 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int length = input.length();
        int money = Integer.parseInt(input);
        int lengthRef = (int)Math.pow(10, length);
        int count = 0;
        while(money/lengthRef == 0){
            money *= 2;
            count++;
        }
        System.out.println(count-1);
    }
}
