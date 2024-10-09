package 알고리즘문제풀이.기하;

import java.lang.*;
import java.io.*;

public class baekjoon16486 {
    static private double PI = 3.141592;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println(2*A + 2*PI*B);
    }
}
