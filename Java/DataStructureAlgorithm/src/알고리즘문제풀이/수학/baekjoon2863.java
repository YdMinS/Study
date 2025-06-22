package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2863 {
    static int A, B, C, D;
    static int result = -1;
    static double MAX = Double.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(result);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
    }

    private static void execute() {
        for(int i=1; i<=4; i++){
            rotate();
            double calculatedValue = calculate();
            if(MAX < calculatedValue){
                MAX = calculatedValue;
                result = i%4;
            }
        }
    }

    private static void rotate(){
        int temp = A;
        A = C;
        C = D;
        D = B;
        B = temp;
    }

    private static double calculate(){
        return (double)A/C + (double)B/D;
    }
}
