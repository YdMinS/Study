package 알고리즘문제풀이.문자열;

import java.lang.*;
import java.io.*;

public class baekjoon10798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[][] strList = new String[5][15];
    static StringBuilder stringBuilder = new StringBuilder();
    static int maxLength = 0;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(stringBuilder);
    }

    private static void input() throws IOException{
        for(int i=0; i<5; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                strList[i][j] = str.charAt(j)+"";
            }
            maxLength = Math.max(maxLength, str.length());
        }
    }

    private static void execute() {
        for(int i=0; i<maxLength; i++){
            for(int j=0; j<5; j++){
                if(strList[j][i]!=null){
                    stringBuilder.append(strList[j][i]);
                }
            }
        }
    }
}
