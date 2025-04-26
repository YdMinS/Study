package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon14470 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int time = 0;
        if(A<0) {
            time += -1 * A * C;
            time += D;
            time += B * E;
        } else {
            if(A==0) time+= D;
            time += (B - A) * E;
        }
        System.out.print(time);
    }
}
