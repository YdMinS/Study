package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon17427 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long result=0;

    public static void input() throws IOException{
        N = Integer.parseInt(br.readLine());

    }

    public static void execute() {
        for(int i=1; i<=N; i++){
            result += (long) i * (N/i);
        }
    }

    public static void output(){
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
        output();
    }
}
