package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon6322 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Object[] triangle = parseLengths();
        int i = 1;
        while(!(boolean)triangle[3]){
            bw.write("Triangle #"+i+"\n");
            int a = (int)triangle[0];
            int b = (int)triangle[1];
            int c = (int)triangle[2];
            if (a == -1) {
                if(c>b) {
                    double A = Math.sqrt(c * c - b * b);
                    bw.write(String.format("a = %.3f\n", A));
                } else {
                    bw.write("Impossible.\n");
                }
            } else if (b == -1) {
                if(c>a) {
                    double B = Math.sqrt(c * c - a * a);
                    bw.write(String.format("b = %.3f\n", B));
                } else {
                    bw.write("Impossible.\n");
                }
            } else if (c == -1) {
                double C = Math.sqrt(a * a + b * b);
                bw.write(String.format("c = %.3f\n", C));
            }
            bw.newLine();
            i++;
            triangle = parseLengths();
        }
        bw.flush();
        bw.close();
    }

    private static Object[] parseLengths() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        Object[] result = new Object[4];
        boolean isAllZero = true;
        for(int i=0; i<3; i++){
            result[i] = Integer.parseInt(st.nextToken());
            isAllZero = isAllZero && (int)result[i] == 0;
        }
        result[3] = isAllZero;
        return result;
    }
}
