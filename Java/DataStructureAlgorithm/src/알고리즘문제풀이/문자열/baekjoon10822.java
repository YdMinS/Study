package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon10822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).sum();
        System.out.println(result);
    }
}
