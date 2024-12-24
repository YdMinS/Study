package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon29766 {
    static String REF = "DKSH";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        int cnt = 0;
        String str = br.readLine();
        while((index = str.indexOf(REF, index)) != -1){
            cnt++;
            index += REF.length();
        }
        System.out.println(cnt);
    }
}
