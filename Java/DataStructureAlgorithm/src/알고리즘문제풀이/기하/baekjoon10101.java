package 알고리즘문제풀이.기하;

import java.io.*;
import java.lang.*;

public class baekjoon10101 {
    static int A, B, C;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
    }

    private static String execute(){
        if(A+B+C==180){
            if (A == 60 && B == 60 && C == 60) {
                return "Equilateral";
            }
            if (A == B || B == C || A == C) {
                return "Isosceles";
            }
            if (A != B && B != C && C != A) {
                return "Scalene";
            }
        }
        return "Error";
    }
}
