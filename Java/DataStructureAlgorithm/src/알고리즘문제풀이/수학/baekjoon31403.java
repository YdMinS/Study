package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon31403 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println(A + B - C);
        String strA = A + "";
        String strB = B + "";
        String strC = C + "";
        System.out.println(Integer.valueOf(strA+strB)-Integer.valueOf(strC));
    }
}
