package 알고리즘문제풀이.기하;

import java.lang.*;
import java.io.*;

public class baekjoon3053 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double euclidA = calculateE(N);
        double nonEuclidA = calculateT(N);
        System.out.printf("%.6f\n", euclidA);
        System.out.printf("%.6f\n", nonEuclidA);
    }

    private static double calculateE(int r){
        return r * r * Math.PI;
    }

    private static double calculateT(int r){
        return 2*r * 2*r / 2;
    }
}
