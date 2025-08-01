package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon10448 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static List<Integer> triangleSum = new ArrayList<>();
    static {
        triangleSum.add(0);
    }
    static int current = 0;
    static int[] input;

    public static void main(String[] args) throws IOException {
        input();
        for(int i=0; i<N; i++){
            bw.write(execute(input[i])+"");
            if (i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        input = new int[N];
        for(int i=0; i<N; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
    }

    private static int execute(int num) {
        if (num>current){
            setTriangleSum(num);
        }
        int length = triangleSum.size();
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length; j++) {
                for (int k = 1; k < length; k++) {
                    if (num == triangleSum.get(i) + triangleSum.get(j) + triangleSum.get(k)) return 1;
                }
            }
        }
        return 0;
    }

    private static void setTriangleSum(int end) {
        for(int i=current+1; i<=end; i++){
            int t = i*(i+1)/2;
            if(t > end) break;
            triangleSum.add(t);
            current = i;
        }
    }
}
