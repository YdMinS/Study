package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon16394 {
    private static final int STARTED = 1946;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int thisYear = Integer.parseInt(br.readLine());
        System.out.print(thisYear - STARTED);
    }
}
