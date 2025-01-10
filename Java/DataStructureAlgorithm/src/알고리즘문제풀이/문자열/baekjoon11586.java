package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon11586 {
    static int N, emotionLevel;
    static List<String> mirror = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        switch (emotionLevel){
            case 1:
                noneFlap(bw);
                break;
            case 2:
                horizontalFlap(bw);
                break;
            case 3:
                verticalFlap(bw);
        }
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            mirror.add(br.readLine());
        }
        emotionLevel = Integer.parseInt(br.readLine());
    }

    private static void noneFlap(BufferedWriter bw) throws IOException{
        for(String line : mirror){
            bw.write(line+"\n");
        }
    }

    private static void horizontalFlap(BufferedWriter bw) throws IOException{
        for(int i=0; i<N; i++){
            bw.write(new StringBuilder(mirror.get(i)).reverse()+"\n");
        }
    }

    private static void verticalFlap(BufferedWriter bw) throws IOException{
        for(int i=N-1; i>=0; i--){
            bw.write(mirror.get(i)+"\n");
        }
    }
}
