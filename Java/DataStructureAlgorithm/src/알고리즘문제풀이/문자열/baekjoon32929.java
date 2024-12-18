package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon32929 {
    static char[] cArr = "UOS".toCharArray();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())-1;
        int index = n % 3;
        System.out.println(cArr[index]+"");
    }
}
