package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon4690 {
    private static String CUBE_STRING = "Cube = %d, Triple = (%d,%d,%d)\n";

    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int a=6; a<=100; a++) {
            for (int b=2; b<a; b++) {
                for (int c=b; c<a; c++) {
                    for (int d=c; d<a; d++){
                        if(Math.pow(a, 3) == Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3))
                            bw.write(String.format(CUBE_STRING, a, b, c, d));
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
