package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon25915 {
    static final int NUM_ILY = 84;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);
        int result = NUM_ILY;
        result += ch>='I' ? ch-'I' : 'I'-ch;
        System.out.println(result);
    }
}
