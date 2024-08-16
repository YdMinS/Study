package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;

public class baekjoon1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, cnt=0;
    static String[] strList;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(cnt);
    }

    static void input() throws IOException{
        N = Integer.parseInt(br.readLine());
        strList = new String[N];
        for(int i=0; i<N; i++){
            strList[i] = br.readLine();
        }
    }

    static void execute(){
        cnt = N;
        for(int i=0; i<N; i++) {
            int prevChar = -1;
            int[] charList = new int[26];
            for (int j = 0; j < strList[i].length(); j++) {
                int index = strList[i].charAt(j) - 'a';
                if (charList[index] != 0 && prevChar != index) {
                    cnt--;
                    break;
                } else {
                    charList[index]++;
                    prevChar = index;
                }
            }
        }
    }
}
