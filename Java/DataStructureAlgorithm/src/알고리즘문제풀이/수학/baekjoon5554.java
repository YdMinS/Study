package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon5554 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = 0;
        for(int i=0; i<4; i++){
            time += Integer.parseInt(br.readLine());
        }
        System.out.println(time/60);
        System.out.println(time%60);
    }
}
