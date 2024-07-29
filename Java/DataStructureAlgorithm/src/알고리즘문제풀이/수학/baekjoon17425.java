package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon17425 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static final int MAX = 1000000;
    static long[] f = new long[MAX+1];
    static long[] g = new long[MAX+1];

    static void precompute() {
        for(int i=1; i<=MAX; i++){
            for(int j=i; j<=MAX; j+=i){
                f[j] += i;
            }
        }

        for(int i=1; i<=MAX; i++){
            g[i] = g[i-1] + f[i];
        }
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
    }

    static void execute() throws IOException {
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            bw.append(g[num]+"\n");
        }
    }

    static void output() throws IOException {
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        precompute();
        input();
        execute();
        output();
    }
}
