package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon29699 {
    static char[] cArr = "WelcomeToSMUPC".toCharArray();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())-1;
        int index = N%cArr.length;
        System.out.println(cArr[index]+"");
    }
}
