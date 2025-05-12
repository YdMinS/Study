package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon17362 {
    private static final int[] ORDER = {1, 2, 3, 4, 5, 4, 3, 2};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(ORDER[(N-1)%8]);
    }
}
