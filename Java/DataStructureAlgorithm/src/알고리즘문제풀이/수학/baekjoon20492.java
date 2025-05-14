package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon20492 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int total22 = price / 100 * 78;
        int eighty22 = price / 100 * 80 + price / 100 * 20 / 100 * 78;
        System.out.println(total22);
        System.out.println(eighty22);
    }
}
