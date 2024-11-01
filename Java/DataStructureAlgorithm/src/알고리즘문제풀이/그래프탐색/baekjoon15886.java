package 알고리즘문제풀이.그래프탐색;

import java.io.*;

public class baekjoon15886 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        String str = br.readLine();
        char prevChar = str.charAt(0);
        cnt += prevChar=='W' ? 1 : 0;
        for(int i=1; i<N; i++){
            char c = str.charAt(i);
            cnt += prevChar=='E' && c =='W' ? 1 : 0;
            prevChar = c;
        }
        cnt += prevChar=='E' ? 1 : 0;
        System.out.println(cnt);
    }
}
