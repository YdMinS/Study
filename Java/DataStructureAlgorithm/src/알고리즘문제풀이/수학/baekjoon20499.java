package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon20499 {
    private static String HASU = "hasu";
    private static String GOSU = "gosu";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] KDA = Arrays.stream(br.readLine().split("/")).mapToInt(Integer::parseInt).toArray();
        System.out.print(KDA[1] == 0 || KDA[0] + KDA[2] < KDA[1] ? HASU : GOSU);
    }
}
