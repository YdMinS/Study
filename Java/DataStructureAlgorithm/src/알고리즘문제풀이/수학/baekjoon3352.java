package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon3352 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int koreanProblem = Integer.parseInt(br.readLine());
        int mathProblem = Integer.parseInt(br.readLine());
        double koreanADay = Double.parseDouble(br.readLine());
        double mathADay = Double.parseDouble(br.readLine());
        int max = Integer.MIN_VALUE;
        max = Math.max(max, (int)Math.ceil(mathProblem/mathADay));
        max = Math.max(max, (int)Math.ceil(koreanProblem/koreanADay));
        System.out.print(L-max);
    }
}
